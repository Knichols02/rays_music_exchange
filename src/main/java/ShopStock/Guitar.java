package ShopStock;

public class Guitar extends Instrument {

    private int noOfStrings;


    public Guitar(String itemType, double purchasePrice, double salePrice, String colour, int noOfStrings) {
        super(itemType, purchasePrice, salePrice, colour);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }
}
