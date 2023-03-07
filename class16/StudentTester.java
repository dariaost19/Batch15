package class16;

public class StudentTester {
    public static void main(String[] args) { //creating instance variables(when you have to store multi objects)
        Student student = new Student();
student.name="zafar";   //it is an  object
student.id="123";
student.SchoolName="syntax";
student.age=22;
student.weight=70;

Student student1=new Student();
student.name="Hamid";
student.id="546";
//student.SchoolName="syntax";
student.age=30;
student.weight=86;

Student student2=new Student();
      //  student.name="Nelson"; //name is instance variable and it is not shared across the objects
        student.id="576";
      //  student.SchoolName="syntax";
        student.age=26;
        student.weight=76;
        System.out.println(student2.SchoolName);
        System.out.println(Student.SchoolName); //you can access it also with the help of the class


    }
}
