//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Order {
    public static void main(String[] args) {
  Order orderDevice= new Order();

    Device d= Order.orderD("Laptop","HP");
    d.powerOn();
    }

    public static Device orderD(String name, String type){
        return Factory.createDevice(name, type);
    }

}