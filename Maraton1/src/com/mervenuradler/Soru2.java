package com.mervenuradler;

public class Soru2 {

	public static void ilkTekrarEdenSayi(int array[]) {

		boolean flag = false;
		int tekrar = 0;
		int sayi = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (flag) {
				break;
			}
			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] == array[j]) {
					if (flag) {
						tekrar++;
					} else {
						sayi = array[i];
						flag = true;
						tekrar = 2;
					}
				}
			}
		}
		System.out.printf("İlk Tekrar eden " + sayi + " , " + tekrar + " kez tekrar etti.");
	}

	public static void main(String[] args) {

		int array[] = { 7, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7, 12, 7, 7, 7 };
		ilkTekrarEdenSayi(array);

	}

}
