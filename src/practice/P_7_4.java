package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class P_7_4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		List <Integer> listNotlar = new ArrayList <>();
		
		Scanner scan = new Scanner (System.in);
		
		String tamam;
		
		do {
			
			System.out.print(" Not Giriniz :");
			
			int ogrNot = scan.nextInt();
			System.out.println("Tamam mýdýr? : E/H");
				tamam=scan.next();
			listNotlar.add(ogrNot);
			//System.out.println("Tamam mýdýr? : E/H");
		//	tamam=scan.nextLine();
			
			
		} while (tamam.equalsIgnoreCase("E"));
		
		int toplam=0;
		
		
		for (int i = 0; i <listNotlar.size(); i++) {
			
		toplam+=listNotlar.get(i);
		
		
		}
double ortalama=toplam/listNotlar.size();


int ortalamaGecenSayisi=0;

for (int i = 0; i < listNotlar.size(); i++) {
	
	if (listNotlar.get(i)>ortalama) { ortalamaGecenSayisi++;
		
	}
	

	
}
System.out.println("Girilen notlarin ortalamasi :" +ortalama);
System.out.println("Ortalama gecen  ogr sayisi :" +ortalamaGecenSayisi);

	
}

	}


