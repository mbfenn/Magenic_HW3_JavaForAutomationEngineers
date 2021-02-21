/**
 * TODO FOR HOMEWORK - Rectangle.java
 *      [X] Update this class to inherit from BaseShape.java
 *      [X] Update to a valid and logical constructor
 *      [X] Add a static main method
 */
public class Rectangle extends BaseShape {

    /**
     * TODO FOR HOMEWORK: Update the below constructor
     * Creates an instance of the Rectangle class
     * @param length The length of the rectangle
     * @param height The width of the rectangle
     */
    public Rectangle(double length, double height) {
        super("Rectangle", length, height);
    }

    // TODO FOR HOMEWORK: Add a static main method for any debugging purposes
    public static void main(String[] args) {
        Rectangle getRect = new Rectangle(4,20);
        getRect.DEBUG_PrintOutAreaAndPerimeter();
    }
}
