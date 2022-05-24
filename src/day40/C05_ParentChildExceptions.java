package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ParentChildExceptions {

	public static void main(String[] args) {
	
		
		try {
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream("src\\day40\\yazi.txt");
			int k=0;
			while ((k=fis.read())!=-1) {
				System.out.println((char)k);
			}
		} catch (FileNotFoundException e) { // daha genis elek olarak dusunuruz, daha az hataya bakar
			
			e.printStackTrace();
			
		} catch (IOException e) { // bu elek cok sik oldugu icin  ilk bunu yazamayiz, cok hataya bakar
			
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("Gorev tamamlandi");
	}

}