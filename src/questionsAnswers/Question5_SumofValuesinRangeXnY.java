package questionsAnswers;

public class Question5_SumofValuesinRangeXnY {
	// find the sum of elements between x and y (x and y are included)
	public static int SumofXnY(int x, int y) {
		if (x==y) {
			return 0;
		}
		int sum =0, smallest, largest;
		if (x<y) {
			smallest = x;
			largest = y;
		}else {
			smallest = y;
			largest = x;
		}
		
		
		for (int i = smallest; i <=largest; i++) {
			sum += i;
		}
		return sum;
	}
	// body mass index
	public static double BMI(double h, double w) {
		double bmi = w/(h*h);
		return bmi;
	}
	// body mass index category
	public static void BMICategory(double bmi) {
		if (bmi<18.5) {
			System.out.println("UNDERWEIGHT");
		} else if(bmi>=18.5 && bmi<25) {
			System.out.println("NORMAL");

		} else if (bmi>=25 && bmi<30) {
			System.out.println("OVERWEIGHT");
		}else {
			System.out.println("OBESE");
		}
	}
	public static void main(String[] args) {
		int res = SumofXnY(3,5);
		System.out.println(res);
		double height =172.4, weight = 76.6;
		double bmi = BMI(height, weight);
		System.out.println("BMI is "+bmi+ "and category is\n");
		BMICategory(bmi);

	}

}
