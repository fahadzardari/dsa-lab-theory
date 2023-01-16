import java.util.Arrays;

public class Main {
       public static void main(String[] args) {
        
        int[] arr = {180 , 165 , 150 , 170 , 145} ;
        SortingMethods.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        // SortingMethods.quicksort(arr, 0, arr.length - 1);
                // long after = System.nanoTime();
                // System.out.println("Time taken by quicksort = " + (after - before) + " nanoseconds.");
                
                // before = System.nanoTime();
                // after = System.nanoTime();
                // System.out.println("Time taken by insertion sort = " + (after - before) + " nanoseconds.");
                
                // before = System.nanoTime();
                // SortingMethods.selectionSort(arr);
                // after = System.nanoTime();
                // System.out.println("Time taken by selection sort = " + (after - before) + " nanoseconds.");
                
                //                 before = System.nanoTime();
                // SortingMethods.bubbleSort(arr);
                // after = System.nanoTime();
                // System.out.println("Time taken by bubble sort = " + (after - before) + " nanoseconds.");
               
                
       } 
}
