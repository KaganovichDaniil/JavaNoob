/**
 * Created by Daniil on 12.11.2016.
 */
public class Square extends Figure implements Areable {
    private double side;

    public Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side*side);
    }

    @Override
    public void setFigure() {
        System.out.println("Вводим квадрат со стороной "+side);
    }
}
