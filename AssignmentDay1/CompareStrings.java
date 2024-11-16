package AssignmentDay1;

public class CompareStrings {
	public static void main(String[] args) {
	String a="hello";
	String b="hello";
	String c = new String("hello1");
	String d = new String("hello1");
	
	if(a==b) {
		System.out.println("Strings are equal ");
		
	}
	else {
		System.out.println("Strings are not equal ");
	}

	if(a.equals(c)) {
		System.out.println("Strings are equal ");
	}
	else {
		System.out.println("Strings are not equal ");
	}
	if(c.equals(d)) {
		System.out.println("Strings are not equal ");
	}
	else {
		System.out.println("Strings are not equal ");
		
	}
}}
