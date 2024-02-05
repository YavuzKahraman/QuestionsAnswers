package questionsAnswers;

import java.util.Arrays;

public class Question10_ArrayManupulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,1,7,6,1,5,6,4,8,4,7};
		//swapFnL(arr);
		reverseNelement(arr, 6);
		//System.out.println(Arrays.toString(reverseArray(arr)));

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
	public static void reverseNelement(int [] arr, int n) {
		int [] revArr = new int [arr.length];
		for (int i = 0; i <n ; i++) {
			revArr[n-i-1]= arr[i];
		}
		for (int i = n; i < revArr.length; i++) {
			revArr[i]=arr[i];
		}
		if (n>=arr.length) {
			System.out.println("Check your key index. Key index must be less or equal than array length");
			return;
		}
			
		
		System.out.println("first "+n+" elements are reversed array: "+Arrays.toString(revArr));

	}

}
