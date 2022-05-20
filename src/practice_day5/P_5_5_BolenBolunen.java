package practice_day5;

import java.util.Scanner;

public class P_5_5_BolenBolunen {
static int bolum=0;
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Bolunen sayiyi giriniz ");
		int bolunen=scan.nextInt();

		System.out.print("Bolen sayiyi giriniz ");
		int bolen=scan.nextInt();
		System.out.println("Sonuc: "+bol(bolunen, bolen));
		scan.close();
	}
	public static int bol(int bolunen, int bolen) {
	while(bolunen>=bolen){
		bolunen-=bolen;
		bolum++;
		
	} 
	
	return bolum;
	}

}
