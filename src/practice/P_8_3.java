package practice;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

@SuppressWarnings("unused")
public class P_8_3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir metin giriniz: ");
		
		String str=scan.nextLine();
		
		String arr []=str.split("");
		
		String enCokTekrarEden="";
		
		int maxSayac=0;
		
		int sayac=0;
		
		for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			
		if (arr[i].equalsIgnoreCase(arr[j])) {
			sayac++;
		}
		
		}
		
		if (sayac>maxSayac) { maxSayac=sayac;
		enCokTekrarEden=arr[i];} else if (sayac==maxSayac) {
			
		enCokTekrarEden+= ", "+arr[i];	
		}
		
		
		sayac=0;
		
		}
		System.out.println(enCokTekrarEden);
		
		}}
