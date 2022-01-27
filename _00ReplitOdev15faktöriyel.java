package _00Replit;

import java.util.Scanner;

public class _00ReplitOdev15faktöriyel {

		public static void main(String[] args) {
	 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Faktoriyel hesaplanması için bir tam sayi giriniz: ");
		int sayi =scan.nextInt();
		
		System.out.print(sayi+ "!=");
		
		int carpim=1;
		
		for (int i= 1; sayi>=i ; i++) {
			carpim *=i;
			System.out.print(i+ "*");
		}
		
		System.out.println("1=" + carpim);
		
		scan.close();
}
}