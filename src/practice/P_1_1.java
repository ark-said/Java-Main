package practice;

public class P_1_1 {

	public static void main(String[] args) {
	
		
		
	int sayi=12345;
	
	int birler= sayi%10;
	int onlar=(sayi/10)%10;
	int yuzler=(sayi/100)%10;
	int binler=(sayi/1000)%10;
	int onBinler=(sayi/10000);
	
	System.out.println(onBinler);
	System.out.println(binler);	
	System.out.println(yuzler);
	System.out.println(onlar);
	System.out.println(birler);
	
	System.out.println(" ");
	
	System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);
	
	
	
	
	}

}
