package product;

public class Tablet implements Device{
    @Override
    public void powerOff() {
        System.out.println("Tablet switched off");
    }

    @Override
    public void powerOn() {
        System.out.println("Tablet switched on");
    }
    public void behavior(){
        System.out.println("Easy to carry");
    }
}
