package practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class P_6_1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Array'in boyutunu giriniz");
		
		int arrBoyutu=scan.nextInt();
		
		int array []=new int[arrBoyutu];
		
	for (int i = 0; i < array.length; i++) {
		
		System.out.println("Arrayin "+(i+1)+". elemanýný giriniz");
		
		array[i]=scan.nextInt();
		
		
		
		
	}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	scan.close();	
		System.out.println("Girdiginiz arrayin max - min eleman degeri: "+(array[arrBoyutu-1]-array[0]));
	}

}
