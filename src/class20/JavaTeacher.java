package class20;

public class JavaTeacher  extends Teacher{
    void code(){
        System.out.println("Java teacher teaches how to code");
    }

    public static void main(String[] args) {
        JavaTeacher jt=new JavaTeacher();
        jt.name="Asel"; //private
        jt.subject="Java"; //private
       // jt.teacherID(); private is not available
        jt.Task(); //public
        jt.explain(); //default
        jt.code();
        jt.homework(); //protected
      //  jt.Funny();  private variables and methods.
    }
}
