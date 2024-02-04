package questionsAnswers;

public class Question6_GapLunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gap(10, 32, 11, 40)); // Should print true
        System.out.println(gap(12, 0, 13, 15));  // Should print true

	}
	public static boolean gap(int h1, int m1, int h2, int m2) {
        // Convert both times to minutes
        int time1InMinutes = h1 * 60 + m1;
        int time2InMinutes = h2 * 60 + m2;

        // Calculate the gap in minutes
        int gapInMinutes = time2InMinutes - time1InMinutes;

        // Check if the gap is greater than or equal to 45 minutes
        return gapInMinutes >= 45;
    }

}
