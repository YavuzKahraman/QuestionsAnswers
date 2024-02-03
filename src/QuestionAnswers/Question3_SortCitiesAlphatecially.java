package QuestionAnswers;
import java.util.*;

public class Question3_SortCitiesAlphatecially {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of cities array: ");
		int n = sc.nextInt();
		String [] cities = new String [n];
		
		for (int i = 0; i < n; i++) {
			System.out.println(i+".th city: ");
			cities[i]= sc.next();
		}
		
		sortCities(cities);

		sc.close();
	}

	public static void sortCities(String[] cities) {
		// TODO Auto-generated method stub
		System.out.println("Original city names without order: "+Arrays.toString(cities));
		Arrays.sort(cities);
		System.out.println("Sorted cities: "+Arrays.toString(cities));
	}

}
