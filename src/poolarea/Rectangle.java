package poolarea;

/**
 * Write a class with the name Rectangle. The class needs two fields (instance variable) with name
 * width and length both of type double.
 * The class needs to have one constructor with parameters width and length both of type double and it
 * needs to initialize the fields.
 * <p>
 * In case the width parameter is less than 0 it needs to set the width field value to 0.
 * In case the length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getWidth without any parameters, it needs to return the value of the width
 * field.
 * ● Method named getLength without any parameters, it needs to return the value of the length
 * field.
 * ● Method named getArea without any parameters, it needs to return the calculated area
 * (width * length).
 */
public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
