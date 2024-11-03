import java.util.*;

public class PrototypeRegistry {
    private Map<String, Product> shop=new HashMap<>();

    public void productRegistry(String type, Product product){
        shop.put(type,product);
    }
    public Product createProduct(String type){
        return shop.get(type).clone();
    }
}
