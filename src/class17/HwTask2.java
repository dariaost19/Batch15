package class17;

public class HwTask2 {
    //Create a method that will take a String as a parameter and returns reversed String. Method should be available
    //     to all classes within your project and accessible by class name.
    public static  String reverse(String input){ //static can be called without calling class
    return   new StringBuilder(input)  .reverse().toString();
    }

    public static void main(String[] args) {
        reverse("Monday");
        System.out.println(reverse("monday")); // with static keyword you can print it without calling class if in the same class.

    }

}
