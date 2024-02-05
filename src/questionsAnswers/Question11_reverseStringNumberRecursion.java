package questionsAnswers;

public class Question11_reverseStringNumberRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "yavuz";
		int n = 5690;
		reverseNum(n);
		reverseStr(str);
	}
	// reverse a number using recursion approach
	public static void reverseNum(int n) {
		if (n<10) {	System.out.println(n); return;}
		else { System.out.print(n%10); reverseNum(n/10);}
	}
	
	// reverse a string using recursion approach
	public static void reverseStr(String str) {
		if ((str==null)||(str.length()<=1)) {System.out.println(str);}
		else { System.out.print(str.charAt(str.length()-1)); reverseStr(str.substring(0,str.length()-1));}
	}
		
}
