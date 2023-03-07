package Homework15;

public class A2 {
    //2) Write program to inherit class A that has method printF which is static and call or reuse
    //   that method into class B
   static String name;
   static int age;
    static void printF(){
        System.out.println("Welcome "+name);
    }
}
class B2 extends A2{
    String LastName;

}




