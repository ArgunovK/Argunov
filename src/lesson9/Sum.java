package lesson9;

/**
 * Created by Админ on 01.08.2017.
 */
public class Sum {
    public static void main(String[] args){
        Student ob = new Aspirant ();
        Student [] students = new Student[3];
        students [0] = ob;
        students [1] = new Student();
        students [2] = new Aspirant();
        for (Student student: students) {
            System.out. println (student.getScholarship());
        }
    }
}

