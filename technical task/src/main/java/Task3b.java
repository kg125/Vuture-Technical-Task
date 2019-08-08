import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task3b {

	public static void main(String[] args) throws IOException {
	// Task 3 
		// part b 
		String [] originalword;
		String text;
		String [] censoredwords;
		String repli = "";
		String newF ="";
		String newR ="";
	//String str = "";
			//"I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse.";
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the words that will be Censored");
	originalword= br.readLine().split(" ");
	System.out.println("Enter String");
	text = br.readLine();
	censoredwords = text.split(" |\\.");
	
	int i = 0;
	int to = originalword.length-1;
		
	while(i < originalword.length) {
			String newCensoredword = originalword[i];
			for(String b : censoredwords) {
				if(b.equals(newCensoredword)) {
					newR = b;
					int first = 0;
					int last = b.length() - 1;
					int j = 0;
					while(j < b.length()) {
						if((j != first) && (j != last)) {
							b = b.replace(b.charAt(j), '$');
						}
						j++;
						newF = b;
					}
					
					repli = text.replace(newR, newF);
					text = repli;
				}
				
			}
			i++;
		}
		System.out.println(text);	

	}

}
