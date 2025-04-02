public class Level {
    private boolean goal;
    private int pts;
  
    public Level(boolean g, int p) {
        goal = g;
        pts = p;
    }

    public void update(boolean g, int p) {
        goal = g;
        pts = p;
    }
    
    /** Returns true if the player reached the goal on this level and returns false otherwise */
    public boolean goalReached() {
        return goal;
    }

    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints() {
        return pts;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}