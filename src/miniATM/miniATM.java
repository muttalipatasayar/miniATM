package miniATM;

import java.util.Scanner;

public class miniATM {

	public static void main(String[] args) {
		/*
		 * Muttalip Atasayar = IBAN TR12 3456 6545 5435 5456 6564 
		 * muttalip'in kullanici adi ve sifresi = muttalip33 -- 123
		 * 
		 * Medine Atasayar = IBAN TR32 3434 6564 5664 4324 6564
		 * medinenin kullanici adi ve sifresi = ayse21 -- 321
		 * 
		 * 
		 * Bakiye goruntulemek icin 1
		 * Para cekmek icin 2
		 * Farkli Hesaba para yatirmak icin 3
		 * Uygulamadan cikmak icin q tusuna basiniz
		 * 
		 
		 * */
		
		String islemSecenekleri = "Bakiye Goruntuleme -->1"
				+ "Para Cekmek ==>2"
				+ "Farkli hesaba para yatirmak -->3"
				+ "Cikis icin q tusuna basunzu";
		Scanner scanner = new Scanner(System.in);
		
		double muttalipBakiye = 2340;
		String muttalipIban = "TR12 3456 6545 5435 5456 6564";
		String mutalipKullanici= "muto33";
		String muttalipSifre = "123";
		
		
		double ayseBakiye = 4000;
		String ayseIban = "TR32 3434 6564 5664 4324 6564";
		String ayseKullanici = "medine21";
		String ayseSifre = "321";
		
		System.out.println("ATM'ye Hos Geldiniz");
		System.out.println("Lutfen bilgilerinizi giriniz");
		System.out.println("Kullanici Adi : ");
		String kullaniciAdi= scanner.nextLine();
		System.out.println("Sifre : ");
		String kullaniciSifre =scanner.nextLine();
		
		if (kullaniciAdi.equals("muttalip33") && kullaniciSifre.equals("123")) {
			System.out.println("Muttalip hesabina giris yaptiniz");
			System.out.println(islemSecenekleri);
			System.out.println("Lutfen bir secim yapiniz");
			String secim = scanner.nextLine();
			
			switch (secim) {
			case "1":
				System.out.println("Bakiyeniz : "+ muttalipBakiye);
				
				break;
			case "2":
				System.out.println("Cekmek istediginiz tutari giriniz");
				int cekilecekTutar = scanner.nextInt();
				if (muttalipBakiye >= cekilecekTutar) {
					muttalipBakiye -=cekilecekTutar;
					System.out.println("Kalan  Tutar " + muttalipBakiye);
				}else {
					System.out.println("Bakiyenizden fazla para cekemezsiniz");
				}
				break;
			case "3":
				System.out.println("Ne kadar para yatirmak istiyorsunuz ");
				int yatirilacakTutar= scanner.nextInt();
				if (yatirilacakTutar <= muttalipBakiye) {
					System.out.println("Iban Girini : ");
					scanner.nextLine();
					String yatirilacakIBan=scanner.nextLine();
					if (yatirilacakIBan.equals(ayseIban)) {
						System.out.println("Para Ayse adli kisiye yatiriliyor .... ");
						muttalipBakiye -= yatirilacakTutar;
						ayseBakiye+= yatirilacakTutar;
						
					}
				}
				break;
				
		}
			
		}else if (kullaniciAdi.equals("ayse21") && kullaniciSifre.equals("321")) {
			System.out.println("Ayse hesabina giris yaptiniz");
			System.out.println(islemSecenekleri);
			System.out.println("Lutfen bir secim yapiniz");
			String secim= scanner.nextLine();
			switch (secim) {
			
			case "1":
				
				System.out.println("Mevcut bakiyeniz " + ayseBakiye);
				break;
			case "2":
				System.out.println("Cekmek istediginiz tutari giriniz");
				int cekilecekTutar= scanner.nextInt();
				if (ayseBakiye >= cekilecekTutar) {
					ayseBakiye -= cekilecekTutar;
					System.out.println("Kalan tutar " + ayseBakiye);
				}
				else {
					System.out.println("Bakiyenizden fazla para cekemezsiniz");
				}
				break;
			case "3":
				System.out.println("Ne kadar para yatirmak istiyorsunuz ");
				int yatiriacaTutar= scanner.nextInt();
				if (yatiriacaTutar <= ayseBakiye) {
					System.out.println("Lutfen IBAN giriniz");
					scanner.nextLine();
					String yatirilacakIban= scanner.nextLine();
					if (yatirilacakIban.equals(muttalipIban)) {
						System.out.println("Para Muttalip kisisine yatiriliyor");
						ayseBakiye-= yatiriacaTutar;
						muttalipBakiye += yatiriacaTutar;
						
					}
				}
				break;

			
			}
		
		}else {
			System.out.println("Kullanici adiniz ve sifreniz yanlis");
			
		}
		
	}

}
