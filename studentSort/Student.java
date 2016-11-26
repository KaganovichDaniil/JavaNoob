/**
 * Created by Daniil on 08.11.2016.
 */
public class Student {
    public String name;
    public int[] marks;


    public double Averagemark(){
        int sum=0;
        for (int i=0; i<this.marks.length; i++){
            sum+=marks[i];
        }
        return 1.0*sum/marks.length;
    }

    Student (int[] marks) {
        this.marks = marks;
        }


    }

