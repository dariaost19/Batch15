package review9;

public class Customer {
    private String name;
    private long SSN;

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setSSN(long SSN) {
        if (SSN != 0) {
            this.SSN = SSN;
        }
    }

    public long getSSN() {
        return SSN;
    }
}
class PrivateClient{
    private String name;
    private long SSN;
    PrivateClient(String name,long SSN){
        if(name!=null&& !name.isEmpty()){
            this.name=name;
        }if(SSN!=0){
            this.SSN=SSN;
        }
    }
    public String getName(){
        return name;
    }
    public long getSSN(){
        return SSN;
    }
}
   class Bank{
    public static void main(String[] args) {
        Customer c=new Customer();
        c.setName("Slava");
        c.setSSN(12345674);
        System.out.println(c.getName());
        System.out.println(c.getSSN());
        PrivateClient pc=new PrivateClient("Diana",12457854);
        System.out.println(pc.getName());
        System.out.println(pc.getSSN());


    }
}

