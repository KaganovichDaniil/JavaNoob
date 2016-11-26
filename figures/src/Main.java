/**
 * Created by Daniil on 12.11.2016.
 */
public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(10, 10, 10);
        Square square = new Square(10, 10, 10);
        Figure array[] = {circle, square};

        System.out.println(((Areable)array[0]).getArea());
        System.out.println(((Areable)array[1]).getArea());
//        Areable[] circle=new Areable[5];
//        circle[1].getArea();
//        (0.5, 0.8, 4);
        array[0]=circle;
        array[0].setFigure();




    }
}
