package class22;

public class Degree {
    //Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
    //Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
    //Call the method by creating an object of each of the three classes.
    void getPrerequisite(){
        System.out.println("To get degree you need high school diploma");
    }
}
class Bachelor extends Degree{

}
class Master extends Degree{
    void getPrerequisite(){
        System.out.println("To get a Masters degree you need Bachelor degree ");
    }

    public static void main(String[] args) {
        Degree d=new Degree();
        d.getPrerequisite();
      Bachelor b=new Bachelor();
      b.getPrerequisite();
        Master m=new Master();
        m.getPrerequisite();
    }
}
