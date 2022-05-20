package practice_day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_7_3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		 List<String> list = new ArrayList<>();
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Liste atamak için sayi giriniz");
		 System.out.println("Yeterli sayiya ulastiginizda 'q' giriniz. ");
		
		 int toplam=0;
		 
		 String islem="";
		 
		 while(!islem.equalsIgnoreCase("q")) {
			 
			 System.out.println(" sayi giriniz : ");
			 
			 
			 islem=scan.next();
			 
			 list.add(islem);
			 
			 
			 
			 
		 }
		
		 list.remove(list.size()-1);
		 
		 for (String w:list) {int a=Integer.parseInt(w);
		 
		 toplam+=a*a;
		 
		 
			 
		 }
		 

		 System.out.println("Girilen sayilarin karekleri toplami :"+toplam);
	}

}
