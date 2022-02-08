package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store firstStore = new Store("TV");
        firstStore.store(10);
        System.out.println(firstStore.getProduct() + ": " + firstStore.getStock());
        firstStore.dispatch(5);
        System.out.println(firstStore.getProduct() + ": " + firstStore.getStock());

        Store secondStore = new Store("Laptop");
        secondStore.store(10);
        System.out.println(secondStore.getProduct() + ": " + secondStore.getStock());
        secondStore.dispatch(5);
        System.out.println(secondStore.getProduct() + ": " + secondStore.getStock());


    }
}
