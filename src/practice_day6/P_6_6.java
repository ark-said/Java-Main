package practice_day6;

import java.util.Arrays;

public class P_6_6 {

	public static void main(String[] args) {
	
		String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		int topDolar=0;
		int topPound=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("$")) {
				topDolar+= Integer.parseInt(arr[i].replace("$", ""));
				
			} else {topPound+= Integer.parseInt(arr[i].replace("£", ""));
			}
		}
		
		System.out.println("Toplam dolar tutari :"+topDolar);
		System.out.println("Toplam sterlin tutari :"+topPound);
	}

}
