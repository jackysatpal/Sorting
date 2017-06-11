import java.util.Scanner;
public class BubbleSort{
	public static int[] generateRandomArray(int length){
		int[] randomArray = new int[length];
		for(int i=0; i<randomArray.length;i++){
			randomArray[i] = (int)(Math.random() * 10);
		}
		System.out.println("Before sorting:");
		for(int i = 0; i < randomArray.length; i++){
			System.out.print(randomArray[i]+ " ");
		}
		return randomArray;
	}
	public static int[] sortElements(int[] randomArray){
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
	/*
	public static void swapElements(int left, int right){
		int temp = left;
		left = right;
		right = temp;
	}*/
	public static void main(String[] args){
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter number of elements(say 5, 10 etc)");
		int arrayLength = scannerObject.nextInt();
		int[] integerArray = generateRandomArray(arrayLength);
		sortElements(integerArray);
	}
}