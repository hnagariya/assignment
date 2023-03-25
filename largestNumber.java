package assignment;

public class largestNumber {
	int n1;
	int n2;
	int n3;
	int largest;
	void findLargestNumber() {
		if(n1>n2) {
			if(n1>n3) {
			System.out.println( n1 + " is the largest");
			}
			else {System.out.println(n3 +" is the largest");
			}
			}
		else {
			if (n2>n3) {
			System.out.println( n2 + " is the largest");
			}
			else{
			System.out.println( n3 + " is the largest");
			}
		}
	}
}