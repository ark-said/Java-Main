package day38_overriding;

public class KumesHayvanlari extends Kuslar{

	public static void main(String[] args) {
		
		KumesHayvanlari kms1=new KumesHayvanlari();
		kms1.beslenme(); // Tum hayvanlar beslenir
		kms1.hareket(); // Kumes hayvanlari yuruyerek hareket eder
		kms1.solunum(); // Kuslar akcigerleriyle nefes alir
		
		Kuslar kms2 = new KumesHayvanlari();
		kms2.beslenme(); // Tum hayvanlar beslenir
		kms2.hareket(); // Kumes hayvanlari yuruyerek hareket eder
		kms2.solunum(); // Kuslar akcigerleriyle nefes alir
		// kendi spesifik ozellikleri disinda kuslara tabi oluyor
		// ama spesifik bir durmu varsa farkini ortaya koyuyor
		
		Kuslar kms3 = new Kuslar();
		kms3.beslenme(); // Tum hayvanlar beslenir
		kms3.hareket(); // Kuslar ucarak hareket eder
		kms3.solunum(); // Kuslar akcigerleriyle nefes alir
		// Constructoru Kuslar yapinca kuslardan baslar ve ozellikleri ona gore verir
		// overriding yapar
		Animals kms4= new KumesHayvanlari();
		kms4.beslenme(); // Tum hayvanlar beslenir
		kms4.hareket(); //Kumes hayvanlari yuruyerek hareket eder
		kms4.solunum(); // Kuslar akcigerleriyle nefes alir
		// parent class overridden olur
		// child class overriding olur
		// kucuk gruptan yukari dogru cikilir
		Animals kms5= new Animals();
		kms5.beslenme(); // Tum hayvanlar beslenir
		kms5.hareket(); // Tum hayvanlar hareket eder
		kms5.solunum(); // Tum hayvanlar nefes alir
		
		// parent-child class'larda overring varsa java class calismadan bunalri isaretler
		// bir obje ile method cagirinca java data turunun class'indaki method'a gider
		// gidilen method gecersiz kilinmissa java obje'nin constructor'ina bakar
		// constructor ile overriding method ayni class'da ise overriding method calisir
		
	}
	
	public void hareket() {
		System.out.println("Kumes hayvanlari yuruyerek hareket eder");
	}

}