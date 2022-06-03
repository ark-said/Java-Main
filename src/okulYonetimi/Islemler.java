package okulYonetimi;
/*
	BÝR OKUL YÖNETÝM PLATFORMU KODALYINIZ.
	1.	Bu programda, Öðrenci ve Öðretmen Kayýtlarý ile ilgili iþlemler yapýlabilmelidir.
		Kayýtlarda þu bilgiler olabilmelidir.
		Öðretmen: Ad-Soyad,  kimlik No, yaþ, bölüm, ve sicil No bilgileri içermelidir.
		Öðrenci: Ad-Soyad,  kimlik No, yaþ, numara, sýnýf bilgileri içermelidir.
	2.	Program baþladýðýnda Kullanýcýya, Öðretmen ve Öðrenci iþlemlerini seçebilmesi için
		Aþaðýdaki gibi bir menü gösterilsin.
	====================================
	 ÖÐRENCÝ VE ÖÐRETMEN YÖNETÝM PANELÝ
	====================================
	 1- ÖÐRENCÝ ÝÞLEMLERÝ
	 2- ÖÐRETMEN ÝÞLEMLERÝ
	 Q- ÇIKIÞ
	3.	Seçilen Kiþi türüne göre aþaðýdaki iþlemleri gösteren bir alt menü daha gösterilsin.
	============= ÝÞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LÝSTELEME
		 4-SÝLME
		 5-ANA MENÜ
		 Q-ÇIKIÞ
	SEÇÝMÝNÝZ:
	4.	Ýþlemler menüsünde seçilen iþleme göre bir önceki menüde seçilen Kiþi türü ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan tüm kiþileri listeleme gibi iþlemler yapýlabilmelidir.
		Bunun yanýnda bir üst menüye dönme veya çýkýþ iþlemleri de yapýlabilmelidir.
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
                kisiTuru = "OGRENCÝ";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cýkýs();
                break;
            default:
                System.out.println("hatali giris yaptiniz !!!");
                anaMenu();
                break;
        }
    }

    private static void cýkýs() {
        System.out.println("uygulamayi kullandiginiz için thanks bro  :)");
    }

    private static void islemMenusu() {
        System.out.println("Sectiginiz  Kiþi turu icin  aþaðýdaki iþlemlerden tercih yapýnýz.\r\n"
                + "============= ÝÞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LÝSTELEME\r\n"
                + "     4-SÝLME\r\n"
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
        System.out.println("******   " + kisiTuru + " listeleme sayfasý  ******");
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
                System.out.println("Aradýðýnýz öðrenci mevcut deðil");
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
                System.out.println("Aradýðýnýz ogretmen mevcut deðil");
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
                System.out.println("Aradýðýnýz öðrenci mevcut deðil");
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
                System.out.println("Aradýðýnýz ogretmen mevcut deðil");
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
        if (kisiTuru.equals("OGRENCÝ")) {
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