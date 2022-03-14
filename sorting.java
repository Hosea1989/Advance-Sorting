public class sorting {

    public static void main(String[] args) {
        int[] list = new int[10000];

        for (int j =0; j < list.length; j++) {
            list[j] = -j;
        }


        long start = System.currentTimeMillis();
       SortArray.selectionSort(list);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Selection Sort - elapsed time "+ timeElapsed);

        for (int j =0; j < list.length; j++) {
            list[j] = -j;
        }
        //reset the array
        start = System.currentTimeMillis();
        SortArray.quickSort(list,0, list.length - 1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Quick Sort - elapsed time "+ timeElapsed);

        for (int j : list) System.out.println(j + " ");

    }
}
