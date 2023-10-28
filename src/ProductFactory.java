class ProductFactory {
    public Product createProduct(String name, double price) {
        return new Product(name, price);
    }
}