package QuestionAnswers;

public class Question4_methodsPrimeFactorialFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		System.out.println("factorial of 7: "+fact(n));
		System.out.println("fibonacci value of 7th index: "+fibo(n));
	
		System.out.println("is n prime ? "+isPrime(n));
		primeFactors(15);
		System.out.println("******************");
		pFactors(21);

	}
	// factorial of n
	public static int fact(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}
	// fibonacci value of nth index 
	public static int fibo(int n) {
		if (n<=1) {
			return n;
		}
		int first = 0, second = 1, next =0;
		for (int i = 2; i <= n; i++) {
			next = first+second;
			first = second;
			second = next;
		}
		return next;
	}
	// find prime factors of n
	public static void primeFactors(int n) {
		if (n<=1) {
			System.out.println("no prime factor.");
		}
		for (int i = 2; i <=n; i++) {
			while (n%i == 0) {
				System.out.print(i+" ");
				n /= i;	
			}
		}
	}
	public static void pFactors(int n) {
		int fact = 2;
		System.out.print("Prime factors of "+n+" are ");
		while (fact<=n) {
			if (n % fact ==0) {
				System.out.print(fact+"-");
				n = n/fact;
			} else {
				fact++;
			}
		}
	}
	
	// finds if n is prime or not
	public static boolean isPrime(int n) {
		if (n<=1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

}
