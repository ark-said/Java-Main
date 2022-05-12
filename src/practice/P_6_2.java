package practice;

import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unused")
public class P_6_2 {

	public static void main(String[] args) {
		
		
		int arr1 [] []= {{10,20,30},{4},{6,7,20}};
		
		int arrYeni []= new int[arr1.length];
		
	for (int kat = 0; kat < arr1.length; kat++) {
		
		
		for (int daire = 0; daire < arr1[kat].length; daire++) {
			arrYeni[kat]+=arr1[kat][daire];
		}
		
	}
System.out.println(Arrays.toString(arrYeni));


	}}
