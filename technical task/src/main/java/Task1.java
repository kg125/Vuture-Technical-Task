
public class Task1 {

	public static void main(String[] args) {
	// Task 1 	
		String testString = "I have some cheese";
		int count = 0;
		
		// forloop that will get the specific char 
		for(int i = 0; i <=testString.length()-1; i++) {
			if (testString.charAt(i) == 'e') {
		       // will increment the count every time it reads a specific char 
				count++;
		    }
		}
		
		System.out.println(count);
		
		

	}

}
