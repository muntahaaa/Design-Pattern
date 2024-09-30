public class Tablet extends Device{
    public Tablet(String type){
        super(type);
    }
    @Override
    public void powerOff() {
        System.out.println("Tab switched on");
    }

    @Override
    public void powerOn() {
        System.out.println("Tab switched off");
    }
}
