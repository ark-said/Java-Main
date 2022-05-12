package practice;

import java.util.Arrays;

public class P_6_5 {

	public static void main(String[] args) {
	 
		String str="ade1r4d3";
		
		String arr[]=str.split("");
		
		System.out.println(Arrays.toString(arr));
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(Character.isDigit(arr[i].charAt(0))) {
				
				toplam+=Integer.valueOf(arr[i]);
				
			} 
			
		}
		System.out.println("String ifadenin sayi degerleri toplami :"+ toplam);
		
	}

}
