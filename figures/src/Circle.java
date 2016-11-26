/**
 * Created by Daniil on 12.11.2016.
 */
public class Circle extends Figure implements Areable{
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return (3.14*2*radius);
    }

    @Override
    public void setFigure() {
        System.out.println("Вводим круг с радиусом "+this.radius);
    }
}
