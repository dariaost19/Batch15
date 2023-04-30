package class16;

public class Task2CallStudents {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students
    String name;
    String ID;
   static int numberOfStudents;

    public static void main(String[] args) {
        Task2CallStudents student1=new Task2CallStudents();
        student1.name="Daria";
        student1.ID="124678";
        student1.numberOfStudents++;


        Task2CallStudents student2=new Task2CallStudents();
        student2.name="Nelson";
        student2.ID="457912";
        student2.numberOfStudents++;

        Task2CallStudents student3=new Task2CallStudents();
        student3.name="Natalia";
        student3.ID="457924";
        student3.numberOfStudents++;

        System.out.println(Task2CallStudents.numberOfStudents);

    }
}
