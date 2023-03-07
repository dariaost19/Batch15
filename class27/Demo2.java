package class27;

public class Demo2 {
    public static void main(String[] args) {
        String name="Nima";
        String []names={"Hiral","Nima","Laura","Nat"};
        String []arr=new String[2];
        //create a method which can search a name from this array.
        System.out.println(searchName(names,name));

        }


    public static boolean searchName(String []names,String name) {

        for (String n : names) {
            if (n.equals(name)) {
                return true;
            }

        }
        return false;
    }

    }

