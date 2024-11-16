package AssignmentDay1;
import java.util.*;
public class NthLargest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	int[] a= {9,8,7,6,5,4,1,2,3};
	int temp=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("enter nth largest number");
	int n=sc.nextInt();
			System.out.println(n+" largest number is "+a[a.length-n]);
		
			System.out.println("enter nth smallest number");
			int m=sc.nextInt();
					System.out.println(n+" smallest number is "+a[m-1]);

	}
	

}
