package src;

import java.util.Arrays;

import com.algos.sorting.comparison.Sort;
import com.algos.sorting.comparison.BubbleSort;

class Main {

    public static void main(final String[] args) {
        final Sort sorter = new BubbleSort();

        final int[] result = sorter.sort(new int[] {1, 5, 22, 1, 99, 0, 5}); 
        System.out.println(Arrays.toString(result));
    }

}
