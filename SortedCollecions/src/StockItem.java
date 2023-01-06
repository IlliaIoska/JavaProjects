public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantity;
    private int reserved;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public StockItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity - this.reserved;
    }

    public void setPrice(double price) {
        if(price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantity + quantity;
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        }
    }

    public int reserveStockItem(int quantity) {
        if(quantity < this.getQuantity()) {
            this.reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unreserveStockItem(int quantity) {
        if(quantity > this.reserved) {
            return 0;
        }
        this.reserved -= quantity;
        return quantity;
    }

    public int finalizeQuantityOfStockItem(int quantity) {
        if(quantity <= this.reserved) {
            this.quantity -= quantity;
            this.reserved -= quantity;
            return this.quantity;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering stockItem.equals");
        if(obj == this) {
            return true;
        }

        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 11;
    }

    @Override
    public int compareTo(StockItem o) {
//        System.out.println("Entering stockItem.compareTo");
        if(this == o) {
            return 0; // they are equal
        }

        if(o == null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : " + this.price + ". Of this item reserved = " + this.reserved;
    }
}
