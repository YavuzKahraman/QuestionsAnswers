package QuestionAnswers;

import java.util.*;
public class Question1_ConsecutiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// find if elements of an array's elements are consecutive or not.
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you want to check");
		int size = sc.nextInt();

		int [] arr = new int [size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+".index: ");			
			arr[i] = sc.nextInt();
		}
		System.out.println("Original array: "+Arrays.toString(arr));
		
		String message = "";
		if (isConsecutive(arr)) {
			message = "Yes";
		}else {
			message ="NO";
		}
		System.out.println("the array elements are consecutive ?"+message);
		sc.close();

	}
	public static boolean isConsecutive(int [] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1]==arr[i]+1) {
				return true;
			}
		}
		
		return false;
	}

}
