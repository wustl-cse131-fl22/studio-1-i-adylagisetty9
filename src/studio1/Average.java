package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first two integers need to be averaged");
		int n1 = in.nextInt();
		System.out.print(n1);
		int n2 = in.nextInt();
		System.out.print(n2);
		double n3 = ((n1 + n2) / 2.0 ) ;
		System.out.println(n3) ;
		
		

	}

}
