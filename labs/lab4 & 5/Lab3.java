import java.util.Arrays;

public class Lab3 {

  public static int linearSearch1D(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }

    return -1;
  }

  public static int[] linearSearch2D(int[][] arr, int target) {
    int[] a = new int[2];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == target) {
          a[0] = i;
          a[1] = j;
          return a;
        }
      }
    }

    return a;
  }

  public static int binarySearch1d(int[] arr , int target){
        int first = 0;
        int last = arr.length - 1;
        int mid = 0;
        while(first <= last){
                mid = (first + last)/2;
                if(arr[mid] < target){
                        first = mid + 1;
                }else if(arr[mid] > target){
                        last = mid - 1;
                }else{
                        return mid;
                }
        }
        return -1;
  }
  public static int[] binarySearch2d(int[][] arr , int target){
        int[] res = new int[2];
        for(int i = 0 ; i < arr.length ; i++){
                int first = 0;
                int last = arr[i].length - 1;
                int mid = 0;
                while(first <= last){
                        mid = (first + last)/2;
                        if(arr[i][mid] < target){
                                first = mid + 1;
                        }else if(arr[i][mid] > target){
                                last = mid - 1;
                        }else{
                                res[0] = i;
                                res[1] = mid;
                                return res;
                        }
                }       
        }
        return res;
  }


}
