package class30;

import java.util.HashSet;
import java.util.Set;

public class TaskSet {
    public static void main(String[] args) {
        // //Create a Set collection that will hold Objects of Student Type.
        //        // In this set we do not care about the insertion order.
        //        // Each student object should have name and studentID. Display name of each student.
      //  HashSet<Student>students=new HashSet<>(); //specifying name of the class which object  we will be storing

        Set<Student> studentSet=new HashSet<>(); // we can achieve polymorphism using Set
      studentSet.add(new Student("Savo",123654));
      studentSet.add(new Student("David",124784));
      studentSet.add(new Student("Melissa",457941));
      studentSet.add(new Student("Olivia",1245678));
      for (Student s:studentSet){
          System.out.println(s.getName());
      }
    }
}
class Student{
        String name;
        int  studentID;

        Student(String name, int studentID) {
            this.name = name;
            this.studentID = studentID;

            }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    }

