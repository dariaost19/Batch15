package Replits;

public class Replit173 {
        public static void main(String[] args) {
            Tea []tea={new LemonTea("Lemon"),new ChaiTea("Chai")};
            for(Tea t:tea){
                t.addSugar();
            }
            LemonTea l=new LemonTea("Lemon");
            l.addSugar();
            ChaiTea c=new ChaiTea("Lemon");
            c.addSugar();
        }
    }

     abstract class Tea{
        String teaType;
        Tea(String teaType){
            this.teaType=teaType;
        }
        abstract void addSugar();

    }
    class LemonTea extends Tea{
        LemonTea(String teaType) {
            super(teaType);
        }

        @Override
        void addSugar() {
            System.out.println("For Lemon Tea we need 2 spoons of sugar");
        }
    }
    class ChaiTea extends Tea{

        ChaiTea(String teaType) {
            super(teaType);
        }

        @Override
        void addSugar() {
            System.out.println("For Chai Tea we need 1 spoon of sugar");
        }
    }

