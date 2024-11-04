//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  ModernPrinter modernPrinter= new NewPrinter();
  modernPrinter.print();
  //obj adapter
  OutdatedPrinter legacyPrinter= new OutdatedPrinter();
  ModernPrinter outdatedPrinterAdapter= new OutdatedPrinterAdapter(legacyPrinter);
  outdatedPrinterAdapter.print();
  //class adapter
        ModernPrinter classAdapter= new ClassAdapter();
        classAdapter.print();
        }
    }
