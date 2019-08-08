import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Task3c {

	public static void main(String[] args) throws IOException {
	// Task 3 
		// part c (partial done)
		ArrayList<String>original = new ArrayList<String>();
		String text;
		String [] censoredPalwords;
		String r = "";
		String repli = "";
		String newF ="";
		String newR ="";
	//String str = "";
			//"I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse.";
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter String");
	text = br.readLine();
	censoredPalwords = text.split(" |\\.");
	
	for(String b : censoredPalwords) {
		int x = b.length();
		for(int i = x - 1; i>= 0; i --) {
			
			r=r+ b.charAt(i);
			
		}
		if (b.equalsIgnoreCase(r)) {
			System.out.println(b);
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
			System.out.println(newF);
			repli = text.replace(newR, newF);
			text = repli;
		}
		
		r= "";
	}
		
	
		System.out.println(text);	

	}

}
