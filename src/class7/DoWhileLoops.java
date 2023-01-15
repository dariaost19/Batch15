package class7;

public class DoWhileLoops {
    public static void main(String[] args) {
        boolean workday=true;
        int day=1;
        while (workday){
            if(day<=5){
            System.out.println("I need a day off");
        }else{
                System.out.println("I don't need a day off");
                workday=false;
            }
day++; // day=day+1 or day+=1

        }
    }
}
