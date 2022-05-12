package practice;

import java.util.Scanner;

public class P_3_2_BankProject {

	public static void main(String[] args) {
		
		
		System.out.println("*** Welcome to WOMBATBANK ***");
		Scanner scan = new Scanner(System.in);
		
		String islem="1.Islem : BAKIYE\n2.Islem : Para Yatýrma\n3.Islem : Para Cekme\n4.Islem : CIKIS ";

		System.out.println(islem);
		
		System.out.println("Yapmak istediginiz islemi seciniz: ");
		
		int bakiye=5000;

		String secilenIslem=scan.nextLine();
		
		
		switch (secilenIslem) {
		case "1":
			
			System.out.println("Bakiyeniz : " + bakiye);
			
			break;
		case "2":
			
			System.out.println("Cekeceginiz miktari giriniz");
			int cekilecekMiktar=scan.nextInt();
			
			if (cekilecekMiktar<=bakiye) {
				
				
				bakiye-=cekilecekMiktar;
				System.out.println("Para cekme islemi basarili.");
				System.out.println("Yeni hesap bakiyeniz: " +bakiye);
				
				
				
			} else {
				System.out.println("Hesabinizda yeteri kadar para yok.");
				
				
			}
			
			
			break;
		case "3":
			
			
			
			System.out.println("Yatirilacak miktari giriniz");
			int yatirilacakMiktar=scan.nextInt();
			bakiye+=yatirilacakMiktar;
			System.out.println("Para yatirma islemi basarili.");
			System.out.println("yeni hesap bakiyeniz :"+bakiye);
			
			
			break;
		case "4":
			
			System.out.println("Cikis isleminiz basariyla yapildi.");
			
			break;

		default: 
			System.out.println("Hatali secim yaptiniz.");
			
			break;
		
		
		}
		
		
		
		scan.close();
		

	}

}
