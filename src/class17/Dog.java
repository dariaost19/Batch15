package class17;

public class Dog {
    String name;
    String breed;
    int age;
    double weight;
    Dog (String dogName,String dogBreed,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        weight=dogWeight;



    }
    void printInfo(){
        System.out.println( "The dog name is "+name+" breed is "+breed+" and age is "+age+ " and weight "+weight);
    }


}
