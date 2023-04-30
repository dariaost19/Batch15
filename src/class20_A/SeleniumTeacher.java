package class20_A;

import class20.Teacher;

public class SeleniumTeacher extends Teacher {
    public static void main(String[] args) {

        SeleniumTeacher s = new SeleniumTeacher();
        s.name="Frank";
        s.subject="Selenium";
        s.Task(); //public
        s.homework(); //visible through inheritance
      //  s.explain(); default not available


    }
}
