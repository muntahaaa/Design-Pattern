public class Factory {
    public static Device createDevice(String name,String type){
        Device d;
        if(name.equals("Laptop")){
            d=new Laptop(type);
            return d;
        }
        else if(name.equals("SmartPhone")){
            d=new SmartPhone(type);
            return d;
        }
        else if(name.equals("Tablet")){
            d=new Tablet(type);
            return d;
        }
       return null;
    }
}
