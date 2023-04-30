package class20;

public class Teacher {
       public String subject;
       public String name;
       private void Funny(){
            System.out.println("no jokes at the class");
        }
       public void Task(){
            System.out.println("you do a lot of tasks at the class");
        }
      protected  void homework(){
            System.out.println("a lot of homework");
        }
        void explain(){
            System.out.println("best explanation ");
        }

    }
    class MathTeacher extends Homework15.Teacher {
       private int teacherID;
        void tech(){
            System.out.println("This teacher is teaching Math");
        }

    }
    class ChemistryTeacher extends Homework15.Teacher {
       private void TeachingSpeed(){
            System.out.println("This teacher moves slow");
        }
    }
    class PianoTeacher extends Homework15.Teacher {
       protected int yearsOfExperience;
        void Play(){
            System.out.println("This teacher plays very good ");
        }
    }

