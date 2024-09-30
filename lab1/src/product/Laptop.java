package product;

public class Laptop implements Device{
    public String model;

    @Override
    public void powerOff() {
        System.out.println("Laptop switched off");
    }

    @Override
    public void powerOn() {
        System.out.println("Laptop switched on");
    }
    public void behavior(){
        System.out.println("Can have both touch or non-touch interface");
    }
}
