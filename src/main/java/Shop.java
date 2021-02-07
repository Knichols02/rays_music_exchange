import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addStockItem(ISell stockItem){
        stock.add(stockItem);
    }

    public void removeStockItem(ISell stockItem){
        stock.remove(stockItem);
    }

    public int countStock(){
        return stock.size();
    }

}
