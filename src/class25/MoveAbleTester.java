package class25;

public class MoveAbleTester {
    public static void main(String[] args) {
        washAble[] wash={new SmartWatch(),new Inverter(),new Phone()};
        for(washAble w:wash){
            w.wash();
        }

    }
}
