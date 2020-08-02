
import java.util.*;

class Rotate {

    public static int[] rotateArray(int[] arr, int d, int n){
      for(int i=0; i < d; i++){
        arr = rotateByOne(arr, n);
        // System.out.println(Arrays.toString(arr));

      }
      
      return arr;
    } 
  
    // 1 2 3 4 5 n=5      2 3 4 5 
  
    public static int[] rotateByOne(int[] arr, int n){
      int i;
      int temp = arr[n-1];
      for(i=n-1; i >= 1; i--){
        arr[i] = arr[i-1];
      }
    
      arr[0] = temp;

      return arr;
    }

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String tc = s.nextLine(); 
        String rotation = s.nextLine(); 
        String input = s.nextLine(); 
        
        String[] rotationArray= rotation.split(" ");
        int[] rotationInt = new int[rotationArray.length];
        for(int i=0; i < rotationArray.length; i++){
            rotationInt[i] = Integer.parseInt(rotationArray[i]);
        }
        // System.out.print("rotation");
        // System.out.println(Arrays.toString(rotationInt));

        String[] inputArray = input.split(" ");
        int[] inputInt = new int[inputArray.length];
        for(int i=0; i < inputArray.length; i++){
            inputInt[i] = Integer.parseInt(inputArray[i]);
        }
      
        int[] arr = rotateArray(inputInt,rotationInt[1], inputInt.length);

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i != arr.length)
                System.out.print(" ");

        }
        // System.out.println(Arrays.toString(arr));
    }
  
}
