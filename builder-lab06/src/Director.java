public class Director {
    public void buildChickenSandwich(Builder builder){
        builder.setBreadType(Bread.REGULAR);
        builder.setFilling(Filling.GRILLED_CHICKEN);
        builder.setSpread(Spread.CHEESE);
    }

    public void buildEggSandwich(Builder builder){
        builder.setBreadType(Bread.TOASTED);
        builder.setFilling(Filling.FRIED_EGG);
        builder.setSpread(Spread.SAUCE);
    }
}
