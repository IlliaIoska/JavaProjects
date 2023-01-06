import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private Map<StockItem, Integer> basketContents;

    public Basket(String name) {
        this.name = name;
        this.basketContents = new TreeMap<>(); //In a TreeMap values, which might have been in a HashMap, are sorted
    }

    public int addToBasket(StockItem stockItem, int quantity) {
        if ((stockItem != null) && (quantity > 0)) {
            int itemValueInBasket = basketContents.getOrDefault(stockItem, 0);
            basketContents.put(stockItem, itemValueInBasket + quantity);
            return itemValueInBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        if(item != null && quantity > 0) {
            int basketItemQuantity = basketContents.getOrDefault(item, 0);
            int newQuantity = basketItemQuantity - quantity;

            if(newQuantity > 0) {
                basketContents.put(item, newQuantity);
                return quantity;
            } else if (newQuantity == 0) {
                basketContents.remove(item);
                return quantity;
            }
        }
        return 0;
    }

    public void clearBasket() {
        this.basketContents.clear();
    }

    public Map<StockItem, Integer> items() {
        return Collections.unmodifiableMap(basketContents);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + this.name + " contains " + this.basketContents.size() + " items\n";
        double totalCost = 0.0;
        for(Map.Entry<StockItem, Integer> item : basketContents.entrySet()) {
            s += item.getKey() + ". " + item.getValue() + " purchased.\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
