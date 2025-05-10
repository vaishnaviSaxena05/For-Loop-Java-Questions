package forloop;

import java.util.Scanner;

public class SumofNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result =0;
		System.out.println("Enter natural number to add ");
		int n = sc.nextInt();
		for(int i=0; i<=n; i++) {
	     result = n*(i+1)/2;
		}
		
		System.out.println("The sum of naturals number = "+result);
	}

}
