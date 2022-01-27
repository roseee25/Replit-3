package _00Replit;

import java.util.Scanner;

public class _00ReplitOdev17KarakterTekrari {

public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri
		 * kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =“John came late"
		 * 
		 * Expected Output:
		 * 
		 * Number of a = 2
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz");
		String isim = scan.nextLine();
		
		char karakter = 'a';
		
		int tekrar = 0;
		int i = 0;
		
		// while ile
		
		while (i<isim.length()) {
			if (isim.charAt(i)==karakter) {
				tekrar++;
			}
			i++;
	}
		
		System.out.println("while ile tekrar sayisi : "+ tekrar);
		
		System.out.println("");
		
		// do-while ile
		
		do {
			if (isim.charAt(i)==karakter) 
				tekrar++;
			i++;
		} while (i<isim.length());
		
		System.out.println("do-while ile tekrar sayisi : " + tekrar);
		
		// for ile 

		for (int j = 0; j < isim.length(); j++) {
			if (isim.charAt(j)==karakter) 
				tekrar++;
			}
		System.out.println("for ile tekrar sayisi : " + tekrar);
		scan.close();
	}

}
