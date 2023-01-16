public class SortingMethods{
        public static int[] bubbleSort(int[] arr){
                for(int i = 0 ; i < arr.length - 1; i++){
                        for(int j = 0; j < arr.length - (1 + i) ; j++){
                                if(arr[j] > arr[j+1]){
                                        int temp = arr[j];
                                        arr[j] = arr[j+1];
                                        arr[j+1] = temp;
                                }

                        }
                }

                return arr;
        }
        public static int[] selectionSort(int[] arr){
                for(int i = 0 ; i < arr.length; i++){
                        int minindex= i;
                        for(int j = i + 1; j < arr.length ; j++){
                                if(arr[minindex] > arr[j]){
                                        minindex = j;
                                }
                        }
                        int temp = arr[i];
                        arr[i] = arr[minindex];
                        arr[minindex] = temp;
                }
                return arr;
        }
        public static int[] insertionSort(int[] arr){
                for(int i = 0 ; i < arr.length ; i++){
                        int j = i;
                        while(j>0 ){
                                if(arr[j] < arr[j-1]){
                                        int temp = arr[j];
                                        arr[j] = arr[j-1];
                                        arr[j-1] = temp;
                                }
                                j--;
                        }
                }

                return arr;
        }
        public static void quicksort(int[] arr ,int low , int high){
                if(low >= high){
                        return;
                }
                int pivot = arr[high];
                int leftPointer = partition(arr , low , high , pivot);
                arr[high] = arr[leftPointer];
                arr[leftPointer] = pivot;
                quicksort(arr, low, leftPointer - 1);
                quicksort(arr, leftPointer + 1, high);

        }
        public static int partition(int[] arr , int low , int high ,int pivot){
                int leftPointer = low;
                int rightPointer = high - 1;
                while(leftPointer < rightPointer){
                        while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                                leftPointer++;
                        }
                        while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                                rightPointer--;
                        }

                                int temp = arr[leftPointer];
                                arr[leftPointer] = arr[rightPointer];
                                arr[rightPointer] = temp;
                }
                if(arr[leftPointer] > arr[high]){

                        int temp = arr[leftPointer];
                        arr[leftPointer] = arr[rightPointer];
                        arr[rightPointer] = temp;
                }else{
                        leftPointer = high;
                }
                return leftPointer;
        }
}