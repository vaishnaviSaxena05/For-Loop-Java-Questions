package forloop;

import java.util.Scanner;

public class EvenNumber {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter number");
	   int num = sc.nextInt();
	 for(int i=0; i<num; i+=2) {
		 System.out.println("So, even numbers are :- "+ i);
		
	 }
}
}
