package class19;

public class Store {
    public static void main(String[] args) {
        Furniture table=new Furniture("Table",100,"White");
        table.PrintInfo();
        Furniture chair=new Furniture("Chair",30,"Brown");
        chair.PrintInfo();
    }
}
