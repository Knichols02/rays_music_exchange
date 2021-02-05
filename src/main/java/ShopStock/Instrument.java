package ShopStock;

public abstract class Instrument extends ShopItems{

    private String colour;


    public Instrument(String itemType, double purchasePrice, double salePrice, String colour) {
        super(itemType, purchasePrice, salePrice);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
