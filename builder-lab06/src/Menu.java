public class Menu {
    private final Bread bread;
    private final Spread spread;
    private  final Filling filling;

    public Menu(Bread bread, Spread spread, Filling filling){
        this.bread=bread;
        this.spread=spread;
        this.filling=filling;
    }
    @Override
    public String toString() {
        return "Sandwich with " +
                "bread: " + bread +
                ", spread: " + spread +
                ", filling: " + filling;
    }

    // Print method to display the menu details
    public void printMenu() {
        System.out.println(this.toString());
    }
}
