package ShopStock;

public abstract class ShopItems {

    private String itemType;
    private double purchasePrice;
    private double salePrice;

    public ShopItems(String itemType, double purchasePrice, double salePrice ){
        this.itemType = itemType;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
