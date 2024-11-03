public class Main {
    public static void main(String[] args) {

        PrototypeRegistry prototypeRegistry=new PrototypeRegistry();
        prototypeRegistry.productRegistry("Hoodie",new Clothing("IITHoodie","Unisex",1200,"L","Black"));
        Product newCloth= prototypeRegistry.createProduct("Hoodie");
        System.out.println(newCloth.toString());
        prototypeRegistry.productRegistry("Laptop",new Electronics("HPlaptop","Non-touch",85000,"1TB","5 Hours"));
        Product newElectronic1= prototypeRegistry.createProduct("Laptop");
        System.out.println(newElectronic1.toString());
        prototypeRegistry.productRegistry("Laptop",new Electronics(newElectronic1.name,newElectronic1.category,newElectronic1.price,"1TB","4 Hours"));
        Product newElectronic2= prototypeRegistry.createProduct("Laptop");

        if(newElectronic1 == newElectronic2 ){
            System.out.println("same product");
        }else{
            System.out.println("different product");
        }
    }
}