package review8;

public class InsuranceTester {
    public static void main(String[] args) {
      Insurance carPolicy=  new CarPolicy("y451hg","John Smith",200,22);
      carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());
        Insurance petPolicy= new PetPolicy("p1245","Joe G",1,100);
        petPolicy.calculateCoverage();
        System.out.println(petPolicy.calculateCoverage());

    }
}
