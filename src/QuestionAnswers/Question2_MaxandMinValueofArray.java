package QuestionAnswers;

public class Question2_MaxandMinValueofArray {

	public static void main(String[] args) {
		// find the max and min element of an array
		int [] arr = {5, 4, 6, 9, 44, 10, 1, 2, 3, 11};
		maxnminvalues(arr);

	}
	public static void maxnminvalues(int [] arr) {
		int maxValue = arr[0], minValue = arr[0], maxIndex=0, minIndex=0; 
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>maxValue) {
				maxValue = arr[i];
				maxIndex = i;
			}
			if (arr[i]<minValue) {
				minValue = arr[i];
				minIndex = i;
			}
		}
		System.out.println("Max value of array is "+maxValue+" at "+maxIndex+" th index");
		System.out.println("Min value of array is "+minValue+" at "+minIndex+" th index");
	}

}
