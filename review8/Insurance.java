package review8;

abstract class Insurance {
    public static String company="Geico";
    String policyNumber;
    String policyHolder;
   public Insurance(String policyNumber,String policyHolder){
        this.policyNumber=policyNumber;
        this.policyHolder=policyHolder;
    }

    public void getInsurance(){ //complete method
        System.out.println("we need insurance");
    }
   abstract double calculateCoverage();

}
class CarPolicy extends Insurance {
    double premium;
    int age;
    CarPolicy(String policyNumber,String policyHolder,double premium,int age){
        super(policyNumber,policyHolder);
        this.premium=premium;
        this.age=age;
    }
    public double calculateCoverage(){
        if (age < 20) {
            return premium*2.5;
        } else if (age < 40) {
            return premium*1.5;
        }else {
            return premium;
        }
    }


}
class PetPolicy extends Insurance{
    int numberOfPets;
    double premium;
    PetPolicy(String policyNumber,String policyHolder,int numberOfPets,double premium){
        super(policyNumber,policyHolder);
        this.numberOfPets=numberOfPets;
        this.premium=premium;
    }
    public double calculateCoverage(){
        if(numberOfPets>2){
            return premium*2.5;

        } else if (numberOfPets>5) {
            return premium*3.5;


        }else {
            return premium;
        }

    }
}
