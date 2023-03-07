package class23;
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism

public class Student {
    public void Hello(){
        System.out.println("Hello Student");
    }
    public void Study(){
        System.out.println("Students love to study");
    }
}
 class SyntaxStudent extends Student{
     @Override
     public void Hello() {
         System.out.println("Hello Syntax Student");
     }

     @Override
     public void Study() {
         System.out.println("Syntax Students love to study Java");
     }
 }
 class CollegeStudent extends Student{
     @Override
     public void Hello() {
         System.out.println("Hello college student");
     }

     @Override
     public void Study() {
         System.out.println("College students love to study Math");
     }
 }
 class SchoolStudent extends Student{

 }
