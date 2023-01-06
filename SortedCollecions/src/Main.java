import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem stockItem = new StockItem("Bread", 0.86, 100);
        stockList.addStockItem(stockItem);

        stockItem = new StockItem("Cheese", 1.5, 200);
        stockList.addStockItem(stockItem);

        stockItem = new StockItem("milk", 2.3, 200);
        stockList.addStockItem(stockItem);

        stockItem = new StockItem("milk", 2.2, 20);
        stockList.addStockItem(stockItem);

        stockItem = new StockItem("juice", 9.9, 200);
        stockList.addStockItem(stockItem);

        System.out.println(stockList);

        Basket basket = new Basket("Illia's");
        sellStockItem(basket, "Cheese", 100);
        System.out.println(basket);
        System.out.println(stockList);

        sellStockItem(basket, "Cheese", 100);
        System.out.println(basket);

        sellStockItem(basket, "Cheese", 100);
        System.out.println(basket);

        sellStockItem(basket, "Gonna", 20);
        System.out.println(basket);

    }

    public static int sellStockItem(Basket basket, String itemName, int itemQuantity) {
        StockItem stockItem = stockList.getStockItem(itemName);
        if(stockItem == null) {
            System.out.println("Do not sell " + itemName);
        }

        if(stockList.reserveStockItem(itemName, itemQuantity) != 0) {
            basket.addToBasket(stockItem, itemQuantity);
            return basket.addToBasket(stockItem, itemQuantity);
        }
        return 0;
    }

    public static int removeStockItem(Basket basket, String itemName, int itemQuantity) {
        StockItem stockItem = stockList.getStockItem(itemName);
        if(stockItem == null) {
            System.out.println("Do not sell " + itemName);
        }

        if(basket.removeFromBasket(stockItem, itemQuantity) == itemQuantity) {
            return stockList.unreserveStockItem(itemName, itemQuantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> stockItem : basket.items().entrySet()) {
            stockList.sellStockItem(stockItem.getKey().getName(), stockItem.getValue());
        }
        basket.clearBasket();
    }
}