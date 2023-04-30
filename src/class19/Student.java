package class19;

public class Student {
    String name;
    String address;
    Student (String name,String address){
        this.name=name;
        this.address=address;
    }
    void DisplayInfo(){
        System.out.println("Student name : "+name +" ,student address : "+address);
    }

    public static void main(String[] args) {
        Student student1=new Student("Jessica","123 White Snow Street, NY NY 10354");
        student1.DisplayInfo();
    }
}
