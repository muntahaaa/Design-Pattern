public class DefensiveBehavior implements Behavior {
    @Override
    public void act(String robotName) {
        System.out.println(robotName + " is acting defensively: Avoiding obstacles and staying safe.");
    }
}