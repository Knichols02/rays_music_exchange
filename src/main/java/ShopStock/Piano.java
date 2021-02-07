package ShopStock;

import Behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private String tuned;

    public Piano(String itemType, double purchasePrice, double salePrice, String colour,
                 String tuned) {
        super(itemType, purchasePrice, salePrice, colour);
        this.tuned = tuned;
    }

    public String isTuned() {
        return "Piano sounds perfect!";
    }

    public String needsTuned(){
        return "Piano sounds awful!";
    }

    public String play(){
        return "Chime, plink, dunnnn";
    }
}
