package ShopStock;

public class GuitarString extends Accessories {

    private String gauge;

    public GuitarString(String itemType, double purchasePrice, double salePrice, int quantity,
                        String gauge) {
        super(itemType, purchasePrice, salePrice, quantity);
        this.gauge = gauge;
    }

    public String getGauge() {
        return gauge;
    }

    public void setGauge(String gauge) {
        this.gauge = gauge;
    }
}
