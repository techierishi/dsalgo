import java.util.*;

class ReverseWord {
  public static void main(String[] args) {
    String problem = "my.name.is.56.rajee.sdfasd.ttv";
    String[] strArray = problem.split("\\.");
    // System.out.println(Arrays.toString(strArray));
    int arrLength = strArray.length;
    
    for(int left = 0, right=arrLength-1; left < arrLength/2; left++, right--){
      String tempStr = strArray[left];
      strArray[left] = strArray[right];
      strArray[right] = tempStr; 
    }

    System.out.println(String.join(".", strArray));
  }
}  

// O(n)