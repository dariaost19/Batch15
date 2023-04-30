package Homework22;

import java.util.HashMap;
import java.util.Map;

//Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
// Output should be in the below format
//John Smith=$100000
public class GreatestSalary {
    public static void main(String[] args) {
        Map<String, Integer> employee = new HashMap<>();
        employee.put("John Smith",100000);
        employee.put("Olivia Brown", 68000);
        employee.put("Frank Twin",85000);
        employee.put("Alice Adams",45500);
        employee.put("Mettew Williams",58200);
        String highestPayEmployee = "";
        int  highestSalary = 0;
        for (var entry : employee.entrySet()) {
            String employeeName = entry.getKey();
             int employeeSalary = entry.getValue();
            if (employeeSalary > highestSalary) {
                highestPayEmployee = employeeName;
                highestSalary = employeeSalary;
            }
        }
        System.out.println(highestPayEmployee + "=" + highestSalary+"$");
        }



}
