package Replits;

class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechnologies() {

    }

    SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;

    }

    void PrintInfo() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }

}
class Main{

    public static void main(String[] args) {
        SyntaxTechnologies s=new SyntaxTechnologies();
        s.PrintInfo();
        SyntaxTechnologies s1=new SyntaxTechnologies("Syntax",6,2020,"07/30/2020");
        s1.PrintInfo();

    }
}