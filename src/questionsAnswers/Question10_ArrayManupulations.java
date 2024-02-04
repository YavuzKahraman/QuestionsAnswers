package questionsAnswers;

import java.util.Arrays;

public class Question10_ArrayManupulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,1,5,6,4,8,4,7};
		//swapFnL(arr);
		System.out.println(Arrays.toString(reverseArray(arr)));

	}
	// Swap first and last elements of array and prompt it to console
	public static void swapFnL(int [] arr) {
		System.out.println("Original array: "+Arrays.toString(arr));
		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1]=temp;
		System.out.println("Swapped array: "+Arrays.toString(arr));
	}
	
	// reverse the array
	public static int [] reverseArray(int [] arr) {
		int [] revArr = new int [arr.length];
		int j =0;
		for (int i = arr.length-1; i >= 0; i--) {
			int temp = arr[i];
			revArr[j] = temp;
			j++;
		}
		return revArr;
	}
	
	// reverse first n elements of an array
	public static void reverseNelement(int [] arr) {
		
	}

}
