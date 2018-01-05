import java.awt.*;

public class Ball {

    private int size;
    private Point coor;

    /**
     * Default constructor, makes a ball size 10 at position (10,10)
     */
    public Ball() {
        size = 10;
        coor.x = 10;
        coor.y = 10;
    }

    /**
     * Constructor with a defined size
     * @param size
     */
    public Ball(int size) {
        this.size = size;
        coor.x = 10;
        coor.y = 10;
    }

    /**
     * Constructor with a defined size and coordinates for starting location
     * @param size
     * @param x
     * @param y
     */
    public Ball(int size, int x, int y) {
        this.size = size;
        coor.x = x;
        coor.y = y;
    }
}
