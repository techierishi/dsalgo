import java.util.*;

class ArraySum {
  
  public static void main(String[] args) {

    int result = 15;
    int[] positions = new int[2];
    int[] arr = {0, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int len = arr.length;
    int sum = 0;

    for(int i=0; i < len; i++){
      sum = arr[i];
      positions[0] = i;

      System.out.println("sum,positions "+ sum +" "+positions[0]);

      for(int j=i+1; j < len; j++){
        sum = sum + arr[j];
        System.out.println("---sum,positions "+ sum +" "+j);

        if(sum > 15) {
          break;
        }else {
          if(sum == 15) {
            positions[1] = j;
            break;
          }
        }
      }
      if(sum == 15) {
            break;
      }

      sum = 0;
    }

    System.out.println(Arrays.toString(positions));
  }
}

// O(n)