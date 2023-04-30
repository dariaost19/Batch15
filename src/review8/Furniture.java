package review8;

public class Furniture {
    public void assemble(){
        System.out.println("furniture needs to be assembled");
    }
    public void comfort(){
        System.out.println("furniture needs to be comfortable");

    }
}
class Chair extends Furniture{

    @Override
    public void comfort() { //overriding method
        System.out.println("Chair needs to be comfortable"); //this method is overridden.
    }
    protected void loveSeat(){
        System.out.println("This is the best chair");
    }
}
class Table extends Furniture{
    @Override
    public void comfort() {
        System.out.println("Table can not be comfortable");
    }
    public void buildTable(){
        System.out.println("We can easily build a table");
    }
    void buildTable(String material){
        System.out.println("we build table from " +material); //overloaded method
    }
}
