import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> stockList;

    public StockList() {
        this.stockList = new LinkedHashMap<>(); //Linked HashMap stores items in order
    }

    public StockItem getStockItem(String itemName) {
        return this.stockList.get(itemName);
    }

    public int addStockItem(StockItem item) {
        if(item != null) {
            StockItem itemInStock = stockList.getOrDefault(item.getName(), item);
            if(itemInStock != item) {
                item.adjustStock(item.getQuantity());
            }

            stockList.put(item.getName(), item);
            return item.getQuantity();
        }
        return 0;
    }

    public int sellStockItem(String itemName, int quantity) {
        StockItem itemInStock = stockList.get(itemName);

        if(itemInStock != null && itemInStock.getQuantity() > 0) {
            return itemInStock.finalizeQuantityOfStockItem(quantity);
        }
        return 0;
//        StockItem itemInStock = stockList.getOrDefault(itemName, null);
//        if(itemInStock != null && this.stockList.get(itemName).getQuantity() > quantity && quantity > 0) {
//            itemInStock.adjustStock(-quantity);
//            return quantity;
//        }
//        return 0;


    }

    public int reserveStockItem(String itemName, int quantity) {
        StockItem itemInStock = stockList.get(itemName);
        if(itemInStock != null && itemInStock.getQuantity() > 0) {
            return itemInStock.reserveStockItem(quantity);
        }
        return 0;
    }

    public int unreserveStockItem(String itemName, int quantity) {
        StockItem itemInStock = stockList.get(itemName);
        if(itemInStock != null && itemInStock.getQuantity() > 0) {
            return itemInStock.unreserveStockItem(quantity);
        }
        return 0;
    }

    public Map<String, StockItem> items() {
        return Collections.unmodifiableMap(stockList);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item : stockList.entrySet()) {
            StockItem stockItem = item.getValue();
            double itemTotalValue = stockItem.getPrice() * stockItem.getQuantity();
            s = s + stockItem + ". There are " + stockItem.getQuantity() + " items in stock. Their value = \n";
            s += String.format("%.2f", itemTotalValue) + "\n";
            totalCost += itemTotalValue;
        }

        return s + "Total stock value " + totalCost;
    }
}
