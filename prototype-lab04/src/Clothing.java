public class Clothing extends Product{
    public String  size;
    public String color;
    public Clothing(){}
    public Clothing(String name, String category, double price, String size, String color) {
        super(name, category, price);
        this.size = size;
        this.color = color;
    }
    public Clothing(Clothing clothing){
        super(clothing);
        if(clothing!=null){
            this.size=clothing.size;
            this.color=clothing.color;
        }
    }
    @Override
    public Product clone() {
        return new Clothing(this);
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", " + super.toString() +
                '}';
    }

}
