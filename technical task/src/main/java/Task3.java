import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

	public static void main(String[] args) {
	// Task 3 ()
		// part a (partial done)
	String str = "I have a cat named Meow and a dog name Woof. I love the dog a lot. He is larger than a small horse.";
	// fixed array of strings
	String[] words = {"dog", "cat", "larger"};
	// will split the orignal string 
     String temp[] = str.split(" ");
     List tempList = Arrays.asList(temp);
     Set<String> tempSet = new HashSet<String>(tempList);
     // if the word is in the orignal String
     // this fuction will loop through the the string finding the matched words from the fixed array
      
	      for (String s: tempSet) {
	         for(int c = 0; c < words.length; c++) {
	        	 if(words[c].equals(s)) {
	        		// System.out.println("The string is: " + str);
	        		// if the fixed word matches any String within the sentence it will be counted and printed 
	       	      System.out.println(s + ":"+ Collections.frequency(tempList, s));
	        	 }
	         }
	      }
	  
	     

//	  
		

	}

}
