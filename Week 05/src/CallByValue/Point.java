package CallByValue;

/**
 * A point on the 2D plane.
 * @param: x and y
 * It has two method:
 *            moveHorizontally(int x): takes an arg, x, and
 *            moveVertically(int y)
 */
public class Point {
    private  int x;
    private int y;

    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * moves the value of x by the given value
     * @param x
     */
    public void moveHorizontally(int x){
        this.x += x;
    }
    public void moveVertically(int y){
        this.y += y;
    }
}
