package ShopStock;

public class Headphones extends Accessories {

    private int impedance;

    public Headphones(String itemType, double purchasePrice, double salePrice, int quantity,
                      int impedance) {
        super(itemType, purchasePrice, salePrice, quantity);
        this.impedance = impedance;
    }

    public int getImpedanceLevel() {
        return impedance;
    }

    public void setImpedance(int impedance) {
        this.impedance = impedance;
    }
}
