package Homework22;
//Create a Person class with following private fields: name, lastName, age, salary.
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map that will store key in ascending order.
// In that map store personId and a Person Object. Print each object details.

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void printUserDetails() {
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }
}
class Tester {
    public static void main(String[] args) {
        Map<Integer, Person> personMap = new LinkedHashMap<>();
        personMap.put(1, new Person("John", "Smith", 25, 55000));
        personMap.put(2, new Person("Olivia", "Brown", 36, 68000));
        personMap.put(3, new Person("Frank", "Twin", 45, 85000));
        personMap.put(4, new Person("Alice", "Adams", 28, 45500));
        personMap.put(5,new Person("Mettew","Williams",32,58200));
        var entrySet = personMap.entrySet();
        for (var entry : entrySet) {
            int personId = entry.getKey();
            Person person = entry.getValue();
            System.out.println(personId);
            person.printUserDetails();


        }
    }
}

