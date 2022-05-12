package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_7_1_List {

	public static void main(String[] args) {
		List<String>list1=new ArrayList<>(Arrays.asList("Ali","Ayse","Fatma","Omer","Veli"));
		List<String>list2=new ArrayList<>();
		for (String w:list1) {
			
			
			if (!w.toLowerCase().contains("a") ) {
				
				
					list2.add(w);
				
			} 
			
		}

		System.out.println(list2);
		
	}

}
