package day16_ForLoop;



public class C01_ForLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
			
		//for loop baslangic ve bitis sarti bir 
		//sayinin degerine bagli olan durumlarda tercih edilir
	
/*	for (int i = 0; i < 10; i--) {
		
		System.out.println(i+ " "); */
		
		//eger baslangic sayisi artis azalis ile bitis degerine
		// yaklasmiyorsa uzlaksiyor ise loop asla bitmez
		// bu duruma sonsuz loop deriz	bu durum gerceklesmemeli
		
		
		
		for (int i = 0; i>10; i++) {
			System.out.println(i + " acaba calisir mi ");
		}
		
		// eger ilk deger icin bitis sarti true olmazsa
		// daha ilk adimda loop broken olur 
		// dolayisiyla loop body hic calismaz loop sonrasina gecilir
		// loop kodu CALISMIS olur ama hicbir islem yapilmaz.
	}}
	

