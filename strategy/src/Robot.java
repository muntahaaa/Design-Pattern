public class Robot {
    private String name;
    private Behavior behavior; // Current behavior
    private String position;   // Context information (example: position)
    private String obstacles;  // Context information (example: nearby obstacles)

    public Robot(String name, String position, String obstacles, Behavior behavior) {
        this.name = name;
        this.position = position;
        this.obstacles = obstacles;
        this.behavior = behavior;
    }

    // Set a new behavior dynamically
    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    // Perform action based on the current behavior
    public void performAction() {
        System.out.println("Position: " + position + ", Obstacles: " + obstacles);
        behavior.act(name);
    }
}