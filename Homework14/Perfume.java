package Homework14;

import class12.perfume;

public class Perfume {
    //3) Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    // and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
    String name;
    String notes;
    int price;
 int size;

    public Perfume(String Pname,String Pnotes,int Pprise ,int Psize){
        name=Pname;
        notes=Pnotes;
        size=Psize;
        price=Pprise;

    }
    private Perfume(String Pname1, int Pprice1){
        name=Pname1;
        price=Pprice1;
    }
    Perfume(String Pname2, String Pnotes1, int Psize3){
        name=Pname2;
        notes=Pnotes1;
        size=Psize3;


    }
    protected Perfume(String Pname3,String Pnotes2){
        name=Pname3;
        notes=Pnotes2;
    }
   public void PerfumeInfo(){
        System.out.println(name + notes+ size + price);
    }


    public static void main(String[] args) {
        Perfume ExNihilo=new Perfume("Fleur Narcotique"," Peony wrapped in woods ",325,  100 ); //public
        ExNihilo.PerfumeInfo();
        Perfume Creed =new Perfume("Aventus for Her",445); //private
        Creed.PerfumeInfo();
        Perfume Killian=new Perfume("Roses on ice"," freshness of cucumber and the aromatic uplift of juniper berries"); //protected
        Killian.PerfumeInfo();
        Perfume TomFord=new Perfume("Ombre Leather "," Cool Spices ",100 ); //default
        TomFord.PerfumeInfo();



    }
}
