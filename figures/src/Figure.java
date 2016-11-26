/**
 * Created by Daniil on 12.11.2016.
 */
public abstract class Figure implements Areable {
    double x;
    double y;
    public Figure (double x, double y){
        this.x=x;
        this.y=y;
    }
    public abstract void setFigure();

}
