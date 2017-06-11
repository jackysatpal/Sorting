package com.algos.sorting.comparison;

public class BubbleSort{

    public int[] sortElements(int[] randomArray){
        for(int i = 0; i < randomArray.length; i++){
        for(int j = 0; j < randomArray.length-1; j++){
                if(randomArray[j] > randomArray[j+1])
                {
                    int temp = randomArray[j];
                    randomArray[j] = randomArray[j+1];
                    randomArray[j+1] = temp;
                }
            }
        }
        System.out.println("\nAfter Sorting:");
        for(int i = 0; i < randomArray.length; i++){
            System.out.print(randomArray[i] + " ");
        }
        return randomArray;
    }

}
