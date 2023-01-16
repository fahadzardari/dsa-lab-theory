import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                //Linear Search
                
                int[] arr = {-2 , 24,89,91 , 25 , 38 , 440 , 5230};
                long before = System.nanoTime();
                int res = Lab3.linearSearch1D(arr, 25);
                long after = System.nanoTime();
              
                if(res != -1){
                        System.out.println("Index found by Linear Search 1D = " + res);
                }else{
                        System.out.println("Not found linear search 1d");
                }
                 System.out.println("Time Taken linear search 1d = " + (after-before));
                // Binary Search
                Arrays.sort(arr);
                before = System.nanoTime();
                after = System.nanoTime();
                res = Lab3.binarySearch1d(arr, 25);
                if(res != -1){
                        System.out.println("Index found by Binary Search 1D = " + res);
                }else{
                        System.out.println("Not found binary search 1d");
                }
                System.out.println("Time Taken linear search 1d = " + (after-before));
                
                // int[][] arr2d = {{23, 32 ,312 , -4} , {53 , 46,2143 ,-23 , -2343 , 32434}};
                // //Linear search 2d
                // int[] result = new int[2];
                // result = Lab3.linearSearch2D(arr2d, 53);
                
                // if(result != null){
                //         System.out.println("Using linear search 2d: ");
                //         System.out.println("Row = " + result[0] + " Column = " + result[1]);
                // }else{
                //         System.out.println("Not found");
                // }
                
                
                // for(int i = 0 ; i <arr2d.length;i++){
                //         Arrays.sort(arr2d[i]);
                // }

                // result = Lab3.binarySearch2d(arr2d, -2343);
                
                // if(result != null){
                //         System.out.println("Using linear search 2d: ");
                //         System.out.println("Row = " + result[0] + " Column = " + result[1]);
                // }else{
                //         System.out.println("Not found");
                // }

        }
}
