package questionsAnswers;

public class Question15_PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "SecureP11";
		String message = "";
		if (isValid(password)) {
			message = message+" YES";
		}else {
			message += "NO";
		}
		System.out.println(password+" is Valid? "+message);

	}

	public static boolean isValid(String password) {
		// check conditions: 
		// case1: length must be in range of [6,10]
		// case2: password consists of only digits and letters
		// case3: must contain at least two digits
		
		//CASE1:
		if (password.length()<6 || password.length()>10) {
			return false;
		}
		//CASE2:
		password = password.toUpperCase();
		int digit_count = 0;
		int letter_count = 0;
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i)>='A' && password.charAt(i)<='Z') {
				letter_count++;
			}else if(password.charAt(i)>='0' && password.charAt(i)<='9') {
				digit_count++;
			}
		}
		//CASE3:
		if (digit_count<2) {
			return false;
		}
		return digit_count+letter_count == password.length();
	}

}
