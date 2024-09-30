import creator.Factory;
import creator.LaptopFactory;
import creator.SmartPhoneFactory;
import creator.TabletFactory;
import product.Device;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Factory factory;
        Device device;

        int choice;
        System.out.println("Select 1.Laptop 2.Smartphone 3.Tablet: ");
        Scanner sc= new Scanner(System.in);
        choice=sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:

               factory = new LaptopFactory();
               device=factory.createDevice();
               device.powerOn();
               break;

            case 2:
                factory = new SmartPhoneFactory();
                device=factory.createDevice();
                device.powerOn();
                break;
            case 3:
                factory = new TabletFactory();
                device=factory.createDevice();
                device.powerOn();
                break;




        }
    }
}
