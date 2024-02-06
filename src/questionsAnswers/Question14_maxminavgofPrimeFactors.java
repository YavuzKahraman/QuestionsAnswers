package questionsAnswers;


// method that finds the prime factors of an integer (input), then returns the 
// average, maximum and minimum of the prime factors


public class Question14_maxminavgofPrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeFactors(72);
		System.out.println();
		System.out.println(find(72));

	}
	// find max, min, and avg
	public static String find(int n){
		if(n<2)
			return 0+" "+0+" "+0;
		double avg=0;
		int  min=n,max=0,count=0;
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				count++;
				System.out.print(i+" ");
				avg+=i;
				n/=i;
				if(i<min)
					min=i;
				if(i>max)
					max=i;
			}
		}

		return "\n"+avg/count+" "+min+" "+max;
	}
	
	public static void primeFactors(int n) {
		// 2 ye kadar olan asal çarpanlar
		while (n%2 == 0) {
			System.out.print("2 ");
			n /=2;
		}
		
		// 3 ve sonrasındaki tek asal çarpanları bulma
		for (int i = 3; i <=Math.sqrt(n); i =+2) {
			while (n%i == 0) {
				System.out.print(i+" ");
				n /= i;
			}
		}
		
	}

}
