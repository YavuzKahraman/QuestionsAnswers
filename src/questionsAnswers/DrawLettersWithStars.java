package questionsAnswers;

public class DrawLettersWithStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letterA(5);System.out.println();
		letterB(5);System.out.println();
		letterC(5);System.out.println();
		letterE(5);System.out.println();

	}
	// Drawing E with stars
	public static void letterE(int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i==0||i==n/2||i==n-1)&& j<n) {
					System.out.print("*");
				}else if((j==0)&& i<n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	//Drawing C with stars
	public static void letterC(int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i==0||i==n-1)&& j<n) {
					System.out.print("*");
				}else if((j==0)&& i<n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	// drawing letter A with stars
	public static void letterA(int n) {
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i==0||i==n/2)&& j<n) {
					System.out.print("*");
				}else if((j==0|| j==n-1)&& i<n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	// drawing B with stars
	public static void letterB(int n) {
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i==0||i==n/2||i==n-1)&& j<n) {
					System.out.print("*");
				}else if((j==0|| j==n-1)&& i<n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
