package okulYonetimi;
/*
	B�R OKUL Y�NET�M PLATFORMU KODALYINIZ.
	1.	Bu programda, ��renci ve ��retmen Kay�tlar� ile ilgili i�lemler yap�labilmelidir.
		Kay�tlarda �u bilgiler olabilmelidir.
		��retmen: Ad-Soyad,  kimlik No, ya�, b�l�m, ve sicil No bilgileri i�ermelidir.
		��renci: Ad-Soyad,  kimlik No, ya�, numara, s�n�f bilgileri i�ermelidir.
	2.	Program ba�lad���nda Kullan�c�ya, ��retmen ve ��renci i�lemlerini se�ebilmesi i�in
		A�a��daki gibi bir men� g�sterilsin.
	====================================
	 ��RENC� VE ��RETMEN Y�NET�M PANEL�
	====================================
	 1- ��RENC� ��LEMLER�
	 2- ��RETMEN ��LEMLER�
	 Q- �IKI�
	3.	Se�ilen Ki�i t�r�ne g�re a�a��daki i�lemleri g�steren bir alt men� daha g�sterilsin.
	============= ��LEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-L�STELEME
		 4-S�LME
		 5-ANA MEN�
		 Q-�IKI�
	SE��M�N�Z:
	4.	��lemler men�s�nde se�ilen i�leme g�re bir �nceki men�de se�ilen Ki�i t�r� ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan t�m ki�ileri listeleme gibi i�lemler yap�labilmelidir.
		Bunun yan�nda bir �st men�ye d�nme veya ��k�� i�lemleri de yap�labilmelidir.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrenciList = new ArrayList<Kisi>();
    static List<Kisi> ogretmenList = new ArrayList<Kisi>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void anaMenu() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");

        String secim = scan.next().toUpperCase();

        switch (secim) {

            case "1":
                kisiTuru = "OGRENC�";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                c�k�s();
                break;
            default:
                System.out.println("hatali giris yaptiniz !!!");
                anaMenu();
                break;
        }
    }

    private static void c�k�s() {
        System.out.println("uygulamayi kullandiginiz i�in thanks bro  :)");
    }

    private static void islemMenusu() {
        System.out.println("Sectiginiz  Ki�i turu icin  a�a��daki i�lemlerden tercih yap�n�z.\r\n"
                + "============= ��LEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-L�STELEME\r\n"
                + "     4-S�LME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");
        int islemTercihi = scan.nextInt();
        switch (islemTercihi) {
            case 0:
                anaMenu();
                break;
            case 1:
                ekleme();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            default:
                System.out.println("hatali giris yaptiniz :( ");
                islemMenusu();
                break;
        }
    }

    private static void listeleme() {
        System.out.println("******   " + kisiTuru + " listeleme sayfas�  ******");
        if (kisiTuru.equalsIgnoreCase("ogrenci")) {
            for (Kisi k : ogrenciList) {
                System.out.println(k.toString());
            }
        } else {
            for (Kisi k : ogretmenList) {
                System.out.println(k.toString());
            }
        }
    }

    private static void silme() {

        System.out.println("*****   " + kisiTuru + " silme sayfasi   *****");
        boolean kontrol = true;

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println("silinecek ogrc kimlik No giriniz :");
            scan.next();
            String silOgrcKimlk = scan.nextLine();
            for (Kisi k : ogrenciList) {
                if (k.getKimlikNo().contains(silOgrcKimlk)) {
                    System.out.println("sildiginiz  ogrenci : " + k.getAdSoyad());
                    ogrenciList.remove(k);
                    kontrol = false;
                    break;
                }
            }
            if (kontrol) {
                System.out.println("Arad���n�z ��renci mevcut de�il");
            }
        } else {
            System.out.print("silinecek ogrt kimlik No giriniz :");
            scan.next();
            String silOgrtKimlk = scan.nextLine();
            for (Kisi k : ogretmenList) {
                if (k.getKimlikNo().contains(silOgrtKimlk)) {
                    System.out.println("sildiginiz ogretmen : " + k.getAdSoyad());
                    ogretmenList.remove(k);
                    kontrol = false;
                    break;
                }
            }
            if (kontrol) {
                System.out.println("Arad���n�z ogretmen mevcut de�il");
            }
        }
    }

    private static void arama() {
        System.out.println("*****   " + kisiTuru + " arama sayfasi   *****");
        boolean kontrol = true;

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.print("aradiginiz ogrc kimlik No giriniz :");

            String araOgrcKimlk = scan.next();
            scan.next();
            for (Kisi k : ogrenciList) {
                if (k.getKimlikNo().equals(araOgrcKimlk)) {
                    System.out.println("aradiginiz ogrenci : " + k.getAdSoyad());
                    kontrol = false;
                }
            }
            if (kontrol) {
                System.out.println("Arad���n�z ��renci mevcut de�il");
            }
        } else {
            System.out.print("aradiginiz ogrt kimlik No giriniz :");
            String araOgrtKimlk = scan.nextLine();
            scan.next();
            for (Kisi k : ogretmenList) {
                if (k.getKimlikNo().contains(araOgrtKimlk)) {
                    System.out.println("aradiginiz ogretmen : " + k.getAdSoyad());
                    kontrol = false;
                }
            }
            if (kontrol) {
                System.out.println("Arad���n�z ogretmen mevcut de�il");
            }
        }
    }

    private static void ekleme() {

        System.out.println("*****   " + kisiTuru + " ekleme sayfasi   *****");
        System.out.print("Ad Soyad giriniz : ");
        scan.nextLine();
        String adSoyad = scan.nextLine();
        System.out.print("Kimlik No giriniz : ");
        String kimlikNo = scan.next();
        System.out.print("Yas giriniz : ");
        int yas = scan.nextInt();
        if (kisiTuru.equals("OGRENC�")) {
            System.out.println("ogrenci NO giriniz : ");
            String numara = scan.next();
            System.out.println("Sinifi giriniz :");
            String sinif = scan.next();

            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, numara, sinif);
            ogrenciList.add(ogrenci);
            System.out.println(ogrenci.toString() + " eklendi");

        } else {
            System.out.println("sicil no giriniz : ");
            String sicilNo = scan.next();
            System.out.println("Bolum giriniz : ");
            String bolum = scan.next();
            Ogretmen ogrt = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);
            ogretmenList.add(ogrt);
            System.out.println(ogrt.toString() + " eklendi");
        }
    }
}