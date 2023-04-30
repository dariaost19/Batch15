package class17;

public class Student {
        String name; //instance variables
        String ID;
        int age;
        double weight;

        Student(String studentName,String studentID,int studentAge,double studentWeight){
            name=studentName; //re-assigning the value
            ID=studentID;
            age=studentAge;
            weight=studentWeight;

        }
        void printStudentInfo(){ //method that will print info
        System.out.println("The student name: " +name+ " student ID : "+ID+ " age : " +age+ " and weight : "+weight);
    }
    }

