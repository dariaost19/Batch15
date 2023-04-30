package class14;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int[] arr1 = {10, 10, 10, 20, 30};
        addArrayElementsMachine(arr1);
        int[] arr2={20,20,40,40};
        addArrayElementsMachine(arr2);
        int []arr3={10,20,30,40};
        addArrayElementsMachine(arr3);

    }
    static void addArrayElementsMachine(int[]array){ //create a method and then call this method by writing a name of this method.
        int sum=0;
        for(int number:array){
            sum+=number;
        }
        System.out.println(sum);

    }
}
