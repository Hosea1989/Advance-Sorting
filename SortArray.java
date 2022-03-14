/**
 * This is the SortArray class
 * The purpose of this class is to sort arrays in ASCENDING order.
 */
public class SortArray {

    /**SelectionSort method. */
    public static void selectionSort (int[] list) {

        for(int i = 0; i <list.length; i++){
            int indexOfLargest = findLargestIndex(list, i);
          //int indexOfSmallest = findSmallestIndex(list, i);
            swap(list,i,indexOfLargest);
           //swap(list, i, indexOfSmallest);
        }
        for (int j : list) System.out.println(j + " ");
    }

    /** findLargestIndex method,
     * it works with */
    public static int findLargestIndex(int[] list, int i){
        int smallestIndex = i;
        for (int j = i + 1; j < list.length; j++){
            if (list[j] < list[smallestIndex]){
                smallestIndex = j;
            }
        }
        return smallestIndex;

    }
    /** quickSort method that accepts just an array */
//    public static void quickSort(int[] list) {
//        quickSort(list, 0, list.length - 1);
//    }

    /** quickSort method that takes an array and the first the first
     * and last numbers in the array. */
    public static void quickSort(int[] list, int first, int last){
        if (last > first){
            int pivotIndex = partition(list, first, last);
            quickSort(list,first, pivotIndex-1); //recursive call
            quickSort(list, pivotIndex +1, last);
        }
    }

    public static void swap(int[] a, int i, int j){
        int smallestNumber = a[j];
        a[j] = a[i];
        a[i] = smallestNumber;
    }

    public static int partition(int[] list, int first, int last){
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {

            while (low <= high && list[low] <= pivot)
                low++;

            while (low <= high && list[low] > pivot)
                high--;

            if (high > low){
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot)
            high--;

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }
}
