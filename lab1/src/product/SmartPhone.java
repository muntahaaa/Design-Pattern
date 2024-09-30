package product;

public class SmartPhone implements Device{
    @Override
    public void powerOff() {
        System.out.println("SmartPhone switched off");
    }

    @Override
    public void powerOn() {
        System.out.println("SmartPhone switched on");
    }
    public void behavior(){
        System.out.println("Has multiple functions");
    }
}
