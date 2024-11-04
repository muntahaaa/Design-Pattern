public class OutdatedPrinterAdapter implements ModernPrinter{

    private OutdatedPrinter outdatedPrinter;
    public OutdatedPrinterAdapter(OutdatedPrinter outdatedPrinter){
        this.outdatedPrinter=outdatedPrinter;
    }
    @Override
    public void print() {
     outdatedPrinter.outdatedPrint();
    }
}
