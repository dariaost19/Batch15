package Replits;

public class Replit141 {
    //Create the maxValue method that will accept int array and return return the maximum value in the array.
    //Method should visible every class in any package!
  public int MaxValue(int[]arr){
      int maxNum=arr[0];
      for (int i = 0; i <arr.length ; i++) {
          if(maxNum<arr[i]){
              maxNum=arr[i];
          }
          
      }
return maxNum;
    }

    public static void main(String[] args) {
        Replit141 r=new Replit141();
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(r.MaxValue(arr)); //should print 22
    }
    }

