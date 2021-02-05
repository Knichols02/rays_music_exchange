package ShopStock;

public abstract class Accessories extends ShopItems {

    private int quantity;

    public Accessories(String itemType, double purchasePrice, double salePrice, int quantity) {
        super(itemType, purchasePrice, salePrice);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
