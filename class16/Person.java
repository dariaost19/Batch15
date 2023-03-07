package class16;

public class Person {
    private double bankBalance=1250000; //private keyword mean that these methods is belongs only to this class and can be shared only in this class.
    String address="Street 128"; //default
    public String name ="John Snow"; //could be accessed anywhere

   private void printPhonePassword(){ //method for printing
        System.out.println("pass 123");
    }
    void printSSN(){ //default method
        System.out.println("122-50-4578");
    }
    public void printTikTokAccount(){
        System.out.println("@user4567");
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printPhonePassword();
        person.printSSN();
        person.printTikTokAccount();
    }

}
