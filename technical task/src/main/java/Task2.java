import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	// Task 2
		String origString  = "";
		String revString  = "";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String");
		
		origString = in.nextLine(); 
		
		int len = origString.length();
		// for loop will reverse the original string 
		for(int i = len - 1; i >= 0 ; i-- ) {
			revString = revString +	origString.charAt(i);
			
		}
		// if the revsed string matches the original then it is a plaindrome
		// else the string is not a vialid palindrome
		if(origString.equals(revString)) {
			System.out.println(" True , This String is a Palindrome");	
		}else {
			System.out.println("False , This String is not a Palindrome");
		}
		

	}

}
