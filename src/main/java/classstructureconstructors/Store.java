package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public void store(int piece){
        stock = stock + piece;
    }

    public void dispatch(int piece){
        stock = stock - piece;
    }
}
