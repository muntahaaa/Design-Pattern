public class SmartPhone extends Device{
    public SmartPhone(String type){
        super(type);
    }
    @Override
    public void powerOff() {
        System.out.println("SmPhone switched on");
    }

    @Override
    public void powerOn() {
        System.out.println("SmPhone switched off");
    }
}
