package practice_day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P_7_2_MDArray {

	public static void main(String[] args) {
	
		String isim [][]= {{"Ali","Veli",",Ayse"},{"Hasan","Can"},{"Suzan"}};
	
		yeniList(isim);
	}
	
	public static void yeniList(String[][]isim) {	 List<String>list1=new ArrayList<>();
	
	for (int kat = 0; kat < isim.length; kat++) {
		for (int daire = 0; daire < isim[kat].length; daire++) {
			list1.add(isim[kat][daire]);
			
			
		}
	}
	
	System.out.println("Ilk Liste :" +list1);
	 Collections.sort(list1);
	System.out.println("Siralamadan sonraki liste :" + list1);}

}
