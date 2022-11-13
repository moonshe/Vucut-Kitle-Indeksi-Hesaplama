package test;

import java.util.Scanner;

public class KodluyoruzOdev1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Boyunuzu metre cinsinden giriniz!");
		float  boy = input.nextFloat();
		
		System.out.println("Kilonuzu kg cinsinden giriniz!");
		double kilo = input.nextDouble();
		
		double vucutKitleIndeks = kilo / (boy * boy);
		System.out.println("Vücut kitle indeksiniz: " + vucutKitleIndeks);


	}

}
