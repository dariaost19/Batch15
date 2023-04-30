package review12;

public class ExceptionsDemo1 {
    public static void main(String[] args) {
        String name = "!Batch15 is Smart";
        try {
            System.out.println(name.charAt(-1));

        } catch (StringIndexOutOfBoundsException ie) {
            ie.printStackTrace(); //provide us all info to find and fix the issue
            System.out.println(ie.getMessage()); //print us exception to the console
        }catch (NullPointerException ne){
            System.out.println(ne.getMessage());
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("rest of the program");
    }
}
