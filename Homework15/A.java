package Homework15;

public class A {
    // Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    String day;
  String  date;
    void Date(){
        System.out.println("Today is  "+day+" date "+date);
    }

}
class B extends A{
    String weather;
    void GoodDay(){
        System.out.println("Good day for walking outside");
    }
}
class C extends B{
    String time;

    void TimeoftheYear(){
        System.out.println(" Winter is a cold season");
    }
}
