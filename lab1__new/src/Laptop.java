public class Laptop extends Device{
 public Laptop(String type){
     super(type);
 }
    @Override
    public void powerOff() {
   System.out.println("Laptop switched on");
    }

    @Override
    public void powerOn() {
        System.out.println("Laptop switched off");
    }
}
