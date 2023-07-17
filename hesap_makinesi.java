package Projeler;

import java.util.Scanner;

public class hesap_makinesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sayi1,sayi2;
		int islem;
		System.out.printf(" Birinci sayınızı giriniz: ");
		sayi1=input.nextDouble();
		System.out.printf(" İkinci sayınızı giriniz: ");
		sayi2=input.nextDouble();
		System.out.printf(" İşlem numaranızı giriniz : \n1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme ");
		islem=input.nextInt();
		if(islem==1)
		System.out.println("Sonucunuz: "+ (sayi1+sayi2));
		else if(islem==2)
		System.out.println("Sonucunuz: "+ (sayi1/sayi2));
		else if(islem==3)
		System.out.println("Sonucunuz: "+ (sayi1*sayi2));
		else if(islem==4)
		System.out.println("Sonucunuz: "+ (sayi1/sayi2));
		else
		System.out.printf("Hatalı işlem girdiniz");
	}

}
