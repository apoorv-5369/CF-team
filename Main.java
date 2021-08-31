import java.util.*;
import java.io.*;
public class main {
	
	public static void main (String[] args) {
        // Your code here
		int count = 0;
		int numOfSols = 0;
		Scanner scan1 = new Scanner(System.in);  
		int testCases = scan1.nextInt();
		int[] canSolve = new int[testCases*3];
		for(int i=0; i<testCases*3; i++) {
			canSolve[i] = scan1.nextInt();
		}
		for(int j=0; j<testCases*3; j+=3) {
			for(int k=j; k<j+3; k++) {
				count += canSolve[k];
				
			}
			if(count>=2) {
				numOfSols++;
				count = 0;
			}else {
				count=0;
			}
		}
		
		System.out.println(numOfSols);
}
	
}
