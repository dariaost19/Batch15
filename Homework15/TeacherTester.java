package Homework15;

public class TeacherTester {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.name="Fira";
        t.subject="History";
        t.explain();
        t.Funny();
        t.Task();
        t.homework();
        System.out.println("******************************");
        MathTeacher m=new MathTeacher();
        m.name="Tim";
        m.teacherID=12456;
        m.subject="Math";
        m.tech();
        m.explain();
        m.Funny();
        m.homework();
        m.Task();
        System.out.println("******************************");

        ChemistryTeacher c=new ChemistryTeacher();
        c.name="Lily";
        c.subject="Chemistry";
        c.TeachingSpeed();
        c.explain();
        c.Task();
        c.Funny();
        c.homework();
        System.out.println("********************************");
       PianoTeacher p=new PianoTeacher();
       p.name="Sara";
       p.subject="Piano";
       p.yearsOfExperience=25;
       p.Play();
       p.explain();
       p.Funny();
    p.homework();
    p.Task();


    }
}
