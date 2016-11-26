package Classes;

import Interfaces.B;
import Interfaces.D;

/**
 * Created by Daniil on 18.11.2016.
 */
public class Q <X extends B, Y extends B, Z extends D> {
    private X x;
    private Y y;
    private Z z;

    public Q(X x, Y y, Z z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int allCalc(){
        return (this.x.calc2()+this.y.calc2()+this.z.calc());
    }
}
