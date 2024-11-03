public class Electronics extends Product{
    public String storage;
    public String batteryLife;
    public Electronics(){}
    public Electronics(String name, String category, double price, String storage, String batteryLife) {
        super(name, category, price);
        this.storage= storage;
        this.batteryLife= batteryLife;
    }
    public Electronics(Electronics electronics){
        super(electronics);
        if(electronics!=null){
            this.storage= electronics.storage;
            this.batteryLife= electronics.batteryLife;
        }
    }
    @Override
    public Product clone() {
        return new Electronics(this);
    }
    @Override
    public String toString() {
        return "Electronics{" +
                "storage='" + storage + '\'' +
                ", batteryLife='" + batteryLife + '\'' +
                ", " + super.toString() +
                '}';
    }

}
