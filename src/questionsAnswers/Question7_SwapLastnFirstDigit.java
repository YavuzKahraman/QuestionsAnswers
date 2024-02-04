package questionsAnswers;

public class Question7_SwapLastnFirstDigit {
	
	// swap first and last digit of a number
	public static int swapFnL(int n) {
		String num = String.valueOf(n);
		String lastDigit = num.substring(num.length()-1), firstDigit = num.substring(0,1), middleDigits =num.substring(1,num.length()-1) ;
		String SwappedNum = lastDigit+middleDigits+firstDigit;
		int swappedNum = Integer.parseInt(SwappedNum);
		return swappedNum;
		
	}
	// reverse a number
	public static int reverseNum(int n) {
		String num = String.valueOf(n);
		String reverseNum = "";
		for (int i = num.length(); i > 0 ; i--) {
			reverseNum += num.substring(i-1,i);
		}
		int reverseNint = Integer.parseInt(reverseNum);
		return reverseNint;
	}
	
	// Palindrome
	public static boolean isPalindrome(int n) {
		String num = String.valueOf(n);
		String reverseNum = "";
		for (int i = num.length(); i > 0 ; i--) {
			reverseNum += num.substring(i-1,i);
		}
		int reverseNint = Integer.parseInt(reverseNum);
		if (n==reverseNint) {
			return true;
		}else {
			return false;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 258499;
		int swappedNum = swapFnL(n);
		System.out.println("Original: "+n+"\nswapped: "+swappedNum);
		System.out.println(reverseNum(n));
		System.out.println("is 4554 palindrome? ");
		if (isPalindrome(4554)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
