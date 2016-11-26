/**
 * Created by Daniil on 08.11.2016.
 */
public class Program {


    public static void main(String[] args) {
        int Arraylist1[] = {1, 3, 3, 5, 2};
        int Arraylist2[] = {3, 5, 5, 5, 3};
        int Arraylist3[] = {4, 3, 4, 3, 4};
        int Arraylist4[] = {3, 4, 2, 3, 3};
        int Arraylist5[] = {5, 3, 5, 3, 4};

        Student a[] = new Student[5];
        a[0] = new Student(Arraylist1);
        a[1] = new Student(Arraylist2);
        a[2] = new Student(Arraylist3);
        a[3] = new Student(Arraylist4);
        a[4] = new Student(Arraylist5);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j].Averagemark() < a[j + 1].Averagemark()) {
                    swap(a, j, j + 1);
                }

            }
        }
        for (int i=0; i<a.length; i++){
            System.out.print(a[i].Averagemark()+" ");
        }


    }


    public static void swap(Student[] a, int i, int j){
        Student temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
