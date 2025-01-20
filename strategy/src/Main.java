//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Behavior aggressive = new AggressiveBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();

        // Create robots with initial behaviors
        Robot robot1 = new Robot("Robot1", "Position(10, 20)", "Obstacle(15, 25)", normal);
        Robot robot2 = new Robot("Robot2", "Position(30, 40)", "Obstacle(35, 45)", defensive);
        Robot robot3 = new Robot("Robot3", "Position(50, 60)", "Obstacle(55, 65)", aggressive);

        // Simulate actions
        System.out.println("\n--- Initial Actions ---");
        robot1.performAction();
        robot2.performAction();
        robot3.performAction();

        // Change behaviors dynamically
        System.out.println("\n--- Changing Behaviors ---");
        robot1.setBehavior(aggressive);
        robot2.setBehavior(normal);
        robot3.setBehavior(defensive);

        // Simulate actions after behavior changes
        System.out.println("\n--- Actions After Behavior Changes ---");
        robot1.performAction();
        robot2.performAction();
        robot3.performAction();
        }
    }
