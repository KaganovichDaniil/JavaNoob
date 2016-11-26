/**
 * Created by Daniil on 12.11.2016.
 */
public class Rectangle extends Figure implements Areable {
    private double length;
    private double width;
    public Rectangle(double x, double y, double length, double width) {
        super(x, y);
        if (length >= width) {
            this.length = length;
            this.width = width;
            }
        else {
            this.length = width;
            this.width = length;
        }
    }

    @Override
    public double getArea() {
        return (this.length*this.width);
    }

    @Override
    public void setFigure() {
        System.out.println("Вводим прямоугольник со сторонами "+length+" и "+width);
    }
}
