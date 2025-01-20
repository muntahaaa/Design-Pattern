public class NormalBehavior implements Behavior {
    @Override
    public void act(String robotName) {
        System.out.println(robotName + " is acting normally: Moving casually through the environment.");
    }
}