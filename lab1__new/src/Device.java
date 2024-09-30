public abstract class Device {
    protected String type;
    public Device(String type){
        this.type=type;
    }
    public abstract void powerOff();
    public abstract void powerOn();
   public String getType(){
       return this.type;
   }
}
