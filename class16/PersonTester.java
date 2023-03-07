package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person tester=new Person();
      //  System.out.println(tester.bankBalance); //private only can be accessed in the same class
        System.out.println(tester.address); //default can not be accessed in other package and classes
        System.out.println(tester.name);

        tester.printTikTokAccount();
        tester.printSSN();
      //  tester.printPhonePassword(); it is a private method , so can be used in other class.
    }
}
