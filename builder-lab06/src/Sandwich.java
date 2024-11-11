public class Sandwich {
    private final Bread bread;
    private final Spread spread;
    private  final Filling filling;


    public Sandwich(Bread bread, Spread spread, Filling filling){
        this.bread=bread;
        this.spread=spread;
        this.filling=filling;
    }

    public Bread getBread() {
        return bread;
    }

    public Spread getSpread() {
        return spread;
    }

    public Filling getFilling() {
        return filling;
    }


}
