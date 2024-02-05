package questionsAnswers;

import java.util.Arrays;

public class Question10_ArrayManupulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,1,7,6,1,5,6,4,8,4,7};
		//swapFnL(arr);
		reverseNelement(arr, 6);
		//System.out.println(Arrays.toString(reverseArray(arr)))
		System.out.println("Reversed array"+Arrays.toString(reverseArray(arr)));
		System.out.println(Arrays.toString(unique(arr)));
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
		for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}
	
	// reverse first n elements of an array
	public static void reverseNelement(int [] arr, int n) {
		 for (int i = 0; i < n / 2; i++) {
	            // Swap elements at index i and (n - 1 - i)
	            int temp = arr[i];
	            arr[i] = arr[n - 1 - i];
	            arr[n - 1 - i] = temp;
	        }
		// check the key index value whether it is greater or not. if it greater, return nothing.
		if (n>=arr.length) {
			System.out.println("Check your key index. Key index must be less or equal than array length");
			return;
		}
		System.out.println("first "+n+" elements are reversed array: "+Arrays.toString(arr));
	}
	
	// find unique elements in an array
	public static int [] unique(int [] arr) {
		int uniqueCount = 0;

        // Count the number of unique elements
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }

        // Create an array to store unique elements
        int[] uniqueElements = new int[uniqueCount];
        int index = 0;

        // Populate the array with unique elements
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueElements[index++] = arr[i];
            }
        }

        return uniqueElements;
    
	}

}
