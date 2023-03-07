package Replits;

public class Replit137 {
    //In main class please declared the variables using different access modifiers that will hold value for:
    //- name
    //- city
    //- name of the school
    //- batch number
    //Create a method to display details in following format:
    //My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
    //Assign values to the variables and execute method display
    //**Expected Output:**
    //My name is John and I live in Miami. I study at Syntax in batch 9
    String name;
    String city;
    String nameOfSchool;
    int batchNumber;

    void PrintInfo(){
        System.out.println("My name is "+name+ " and i live in "+city+ ". I Study at "+nameOfSchool+ " in batch "+batchNumber);
    }

    public static void main(String[] args) {
        Replit137 r=new Replit137();
        r.name="John";
        r.city="Miami";
        r.nameOfSchool="Syntax";
        r.batchNumber=9;
        r.PrintInfo();

    }

}

