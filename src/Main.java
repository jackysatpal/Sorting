package src;

import com.algos.sorting.comparison.BubbleSort;

class Main {

    public static void main(final String[] args) {
       final BubbleSort bubbleSort = new BubbleSort();
       
       final int[] result = bubbleSort.sortElements(new int[] {1, 5, 22, 1, 99, 0, 5}); 
       System.out.println(result);
    }

}
