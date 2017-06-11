package com.algos.sorting.comparison;

public class BubbleSort{

    public int[] sort(final int[] input) {

        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input.length; j++) {

                if(input[i] < input[j]) {
                    final int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }

            }
        }

        return input;

    }

}
