public class StoreManagement {
    public static void main(String[] args) {
        Store myStore = new Store();

        Customer customer1 = new Customer("Almas");
        Customer customer2 = new Customer("Akzhan");

        myStore.registerObserver(customer1);
        myStore.registerObserver(customer2);

        ProductFactory productFactory = new ProductFactory();
        Product product = productFactory.createProduct("QazaqRepublic", 19.99);

        myStore.notifyObservers("New product available: " + product.name + " for $" + product.price);
    }
}