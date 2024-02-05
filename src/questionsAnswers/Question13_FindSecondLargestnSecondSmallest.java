package questionsAnswers;

import java.util.Arrays;

public class Question13_FindSecondLargestnSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 9, 3};
		SpecificElements(arr);

	}
	
	// find magnitude of a specific element
	public static void SpecificElements(int [] arr) {
		int [] uArr = new int [uniqueArr(arr).length];
		System.arraycopy(uniqueArr(arr), 0, uArr, 0, uArr.length);
		System.out.println("Unique Array: "+Arrays.toString(uArr));
		Arrays.sort(uArr);
		System.out.println("Second largest: "+uArr[uArr.length-2]+"\nSecond smallest: "+uArr[1]);
	}
	// first find the count of unique elements and then add them to another array.
	// then, sort the array to find specific order element
	public static int [] uniqueArr(int[] arr) {
		// unique element count:
		int uniqueCount = 0;
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
