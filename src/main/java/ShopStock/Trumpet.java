package ShopStock;

public class Trumpet extends Instrument {

    private int noOfValves;


    public Trumpet(String itemType, double purchasePrice, double salePrice, String colour, int noOfValves) {
        super(itemType, purchasePrice, salePrice, colour);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public void setNoOfValves(int noOfValves) {
        this.noOfValves = noOfValves;
    }

    public String canPlay(){
        return "High pitched Trumpity Sounds";
    }
}
