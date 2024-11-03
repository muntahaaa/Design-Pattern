public abstract class Product {
    public String name;
    public String category;
    public double price;
 public  Product(){

 }
    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Product(Product product) {
        if (product != null) {
            this.name = product.name;
            this.category = product.category;
            this.price = product.price;
        }
    }

 public abstract Product clone();

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
