package class25;
interface washAble{
    void wash();
}

public class SmartWatch implements washAble {
    @Override
    public void wash() {

    }
}
class Phone implements washAble{

public void wash(){
    System.out.println("I am IP65 Rated you can wash me");
}
}
class Inverter implements washAble{
    public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}

