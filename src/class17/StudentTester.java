package class17;

public class StudentTester {
    public static void main(String[] args) { //creating 5 objects
        Student student1=new Student("Daria","578J",27,120);
        student1.printStudentInfo();
        Student student2=new Student("Adel","457G",28,122);
        student2.printStudentInfo();
        Student student3=new Student("John","548T",29,145);
        student3.printStudentInfo();
        Student student4=new Student("Frank","853F",32,160);
        student4.printStudentInfo();
        Student student5=new Student("Sam","513E",30,175);
        student5.printStudentInfo();
    }
}
