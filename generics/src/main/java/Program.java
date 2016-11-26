import Classes.Q;
import Classes.X;
import Classes.Y;
import Classes.Z;


public class Program {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Z z = new Z();

        Q<X, Y, Z> q = new Q<>(x, y, z);
        System.out.println(q.allCalc());


    }
}
