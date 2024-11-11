public class SandwichMenuBuilder implements Builder{

    private Bread bread;
    private Spread spread;
    private Filling filling;
    @Override
    public void setBreadType(Bread bread) {
        this.bread=bread;

    }

    @Override
    public void setSpread(Spread spread) {
        this.spread=spread;

    }

    @Override
    public void setFilling(Filling filling) {
        this.filling=filling;
    }

    public Menu getSandwichMenu(){
        return new Menu(bread,spread,filling);
    }

}
