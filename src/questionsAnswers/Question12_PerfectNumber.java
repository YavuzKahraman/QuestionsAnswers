package questionsAnswers;

import java.util.Arrays;

public class Question12_PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for (int i = 2; i < 1000; i++) {
			if (isPerfect(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
		
		int [] perfArr = new int [count];
		int j= 0;
		for (int i = 2; i < 1000; i++) {
			if (isPerfect(i)) {
				perfArr[j++]=i;
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(perfArr));
		
		// check elements of perfArr whether they are prime or not.
		// if they are all prime ? result array must be [true, true, true ...]
		boolean [] boolArr = new boolean [count]; 
		for (int i = 0; i < perfArr.length; i++) {
			if (isPrime(perfArr[i])) {
				boolArr[i] = true;
			}else {
				boolArr[i] = false;
			}
		}
		System.out.println(Arrays.toString(boolArr));

	}
	
	// checks if n is prime or not?
	public static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= n; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPerfect(int n) {
		int sum =0;
		for (int i = 1; i < n; i++) {
			if (n%i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			return true;
		}
		return false;
	}

}
