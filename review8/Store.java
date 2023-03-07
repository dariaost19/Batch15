package review8;

import PracticeJava.T;

public class Store {
    public static void main(String[] args) {
        Furniture chair=new Chair(); //upcasting
        chair.comfort(); //runtime polymorphism
        chair.assemble();
        Furniture table=new Table();
        table.comfort();
        table.assemble();
        Table table1=new Table();
        table1.buildTable();
        table1.assemble();
        table1.comfort();
        table1.buildTable("wood"); //compile time polymorphism


    }
}
