//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Director director = new Director();
SandwichBuilder sandwichBuilder= new SandwichBuilder();
director.buildChickenSandwich(sandwichBuilder);

Sandwich sandwich= sandwichBuilder.getSandwich();
System.out.println("Sandwich built: "+sandwich.getFilling());

SandwichMenuBuilder menuBuilder=new SandwichMenuBuilder();
director.buildEggSandwich(menuBuilder);
Menu eggSandwichMenu= menuBuilder.getSandwichMenu();
        eggSandwichMenu.printMenu();

    }
}