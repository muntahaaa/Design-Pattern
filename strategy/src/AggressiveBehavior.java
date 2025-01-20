public class AggressiveBehavior implements Behavior {
    @Override
    public void act(String robotName) {
        System.out.println(robotName + " is acting aggressively: Attacking nearby targets!");
    }
}