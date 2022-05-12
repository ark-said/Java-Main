package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class P_8_1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int arr []=new int [6];
		
		
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Sayi giriniz");
			arr[i]=scan.nextInt();
			}
		
System.out.println(tekEleman(arr));


	}

	private static ArrayList<Integer> tekEleman(int[] arr) {
	
ArrayList<Integer>list = new ArrayList <>();

for (int i = 0; i < arr.length; i++) {
	if (arr[i]%2==1) {
		list.add(arr[i]);
	}
}
		
	return list;
			
	}

}
