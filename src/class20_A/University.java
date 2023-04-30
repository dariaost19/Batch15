package class20_A;

import class20.JavaTeacher;

public class University {
    public static void main(String[] args) {
        JavaTeacher jt1=new JavaTeacher();
        jt1.name="John";
        jt1.subject="Java";
        jt1.Task(); //public
        // jt1.homework();  protected not visible in diff package
      //  jt1.explain();  default not visible in diff package
      //  jt1.Funny(); private
    }
}
