package questionsAnswers;

public class Question8_HCFnLCM {

	//finds highest common factor and least common multiple of two number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 12, n2=18;
		int hcf = HCF(n1,n2), lcm = LCM(n1,n2);
		System.out.println("HCF: "+hcf+"\nLCM: "+lcm);
		

	}
	public static int HCF(int n1, int n2) {
		int hcf = 1;
		for (int i = 1; i <= n1 && i<=n2; i++) {
			if (n1%i ==0 && n2%i == 0) {
				hcf = i;
			}
		}
		return hcf;
	}
	public static int LCM(int n1, int n2) {
		int lcm = (n1*n2)/HCF(n1,n2);
		return lcm;
	}

}
