package AssignmentDay1;

public class SubarrayAddition {
public static void main(String[] args) {
	int[] a= {1,2,3,4,7,8,9,4,5,6,1,2,2};
	int value=12;
	int[] b=new int[20];
	
	for(int i=0;i<=a.length-1;i++) {
		for(int j=i+1;j<=a.length-1;j++) {
			if(a[i]+a[j]==value) {
				System.out.print(a[i]);
				System.out.print(",");
				System.out.print(a[j]);
				System.out.println();
				
			}
		}
	}
	
}
}
