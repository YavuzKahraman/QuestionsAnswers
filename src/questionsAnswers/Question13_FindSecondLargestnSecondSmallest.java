package questionsAnswers;

import java.util.Arrays;

public class Question13_FindSecondLargestnSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void SpecificElements(int [] arr) {
		int [] uArr = new int [uniqueArr(arr).length];
		Arrays.sort(uArr);
		System.out.println("Second largest: "+uArr[uArr.length-2]+"\nSecond smallest: "+uArr[1]);
	}
	private static int [] uniqueArr(int[] arr) {
		// TODO Auto-generated method stub
		return arr;
	}

}
