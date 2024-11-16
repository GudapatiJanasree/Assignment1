package AssignmentDay1;
import java.util.*;
public class SeriesOfCharacters {
public static void main(String[] args) {
	/* Write a program to replace a series of characters with @ in a string?
 Ex: The weather is veryy cool here
 Output: The weather is ver@ c@l here*/
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a word : ");
	String str  = sc.nextLine();
	String str1 = "";
	for(int i = 0; i< str.length(); i++) {
		char ch = str.charAt(i);
		if(str.length()-1 != i) {
			if(str.charAt(i) == str.charAt(i+1)) {
				ch = '@';
				i++;
			}
		}
		str1 = str1+ ch;
	}
	sc.close();
	System.out.println(str1);
			
		}
	
		}

	
	
	
	


