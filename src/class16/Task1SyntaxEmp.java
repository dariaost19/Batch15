package class16;

public class Task1SyntaxEmp {
    //Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects
    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {

        Task1SyntaxEmp SyntaxEmployee = new Task1SyntaxEmp();
        SyntaxEmployee.empId = "12345788A";
        SyntaxEmployee.salary = 65000;



        Task1SyntaxEmp SyntaxEmployee2 = new Task1SyntaxEmp();
        SyntaxEmployee.empId = "12457424C";
        SyntaxEmployee.salary = 85000;



        System.out.println(SyntaxEmployee.empId);
        System.out.println(SyntaxEmployee.salary);
        System.out.println(SyntaxEmployee.CEO);

    }
}
