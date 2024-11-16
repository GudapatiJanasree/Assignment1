package AssignmentDay1;

public class Palindrome {
public static void main(String[] args) {
	String a="harshsrah";
	String b="";
	int n=a.length();
	for(int i=n-1;i>=0;i--) {
		b=b+a.charAt(i);
	}
	System.out.println(b);
	if(a.equals(b)) {
		System.out.println("Its a Palindrome");
	}
	else {
		System.out.println("its not a Palindrome");
	}
}


}
