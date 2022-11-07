package com.mervenuradler;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("* * * * * * * * * * * * * * * * * * *");
		System.out.println("**     GEOMETRİK HESAPLAYICI       **");
		System.out.println("* * * * * * * * * * * * * * * * * * *\n");

		System.out.println("1.Kare alan hesaplama\n2.Kare çevre hesaplama"
				+ "\n3.Dikdörtgen alan hesaplama\n4.Dikdörtgen çevre hesaplama"
				+ "\n5.Daire alan hesaplama\n6.Daire çevre hesaplama\n7.Çıkış");

		System.out.println("\nLüften yapmak istediğiniz işlemi giriniz: ");

		int islem = scanner.nextInt();

		while (islem != 7) {

			if (islem == 1) {

				System.out.println("\nKarenin kenar uzunluğunu giriniz: ");
				Scanner scanner1 = new Scanner(System.in);

				int sayi1 = scanner.nextInt();

				System.out.println("Alanı = " + " " + sayi1 * sayi1);
			} else if (islem == 2) {
				System.out.println("\nKarenin kenar uzunluğunu giriniz: ");
				Scanner scanner2 = new Scanner(System.in);

				int sayi2 = scanner.nextInt();

				System.out.println("Çevresi = " + " " + sayi2 * 4);

			}

			else if (islem == 3) {
				System.out.println("\nDikdörtgenin kenar uzunluğunu giriniz: ");
				Scanner scanner3 = new Scanner(System.in);

				int sayi3 = scanner.nextInt();

				System.out.println("\nDikdörtgenin diğer kenar uzunluğunu giriniz: ");
				Scanner scanner4 = new Scanner(System.in);

				int sayi4 = scanner.nextInt();

				System.out.println("\nAlanı = " + " " + sayi3 * sayi4);

			}

			else if (islem == 4) {
				System.out.println("\nDikdörtgenin kenar uzunluğunu giriniz: ");
				Scanner scanner5 = new Scanner(System.in);

				int sayi5 = scanner.nextInt();

				System.out.println("\nDikdörtgenin diğer kenar uzunluğunu giriniz: ");
				Scanner scanner6 = new Scanner(System.in);

				int sayi6 = scanner.nextInt();

				System.out.println("\nÇevresi = " + " " + 2 * (sayi5 + sayi6));

			} else if (islem == 5) {

				float pi = 3.14F;

				System.out.println("\nDairenin yarıçapını giriniz: ");
				Scanner scanner7 = new Scanner(System.in);

				float sayi7 = scanner.nextInt();

				System.out.println("\nDairenin çevresi : " + pi * sayi7 * 2);
			} else if (islem == 6) {

				float pi = 3.14F;
				System.out.println("\nDairenin yarıçapını giriniz: ");
				Scanner scanner8 = new Scanner(System.in);

				float sayi8 = scanner.nextInt();

				System.out.println("\nDairenin alanı : " + pi * sayi8 * sayi8);

			} else {
				System.out.println("\nLüften farklı bir sayı giriniz.");
				break;
			}
		}
		System.out.println("Çıkış yaptınız!");

		return;

	}

}
