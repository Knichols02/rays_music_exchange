package ShopStock;

import Behaviours.ISell;

public abstract class ShopItems implements ISell {

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

    public double calculateMarkup() {
        //sale price - purchase price /purchase price ) multiplied by 100
        double markupPercentage = ((salePrice - purchasePrice) / purchasePrice) * 100;
        return markupPercentage;
    }
    public double calculateProfit(){
        // sale price - purchase price = profit
        double profit = salePrice - purchasePrice;
        return profit;
    }
}
