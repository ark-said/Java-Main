package practice_day4;

public class P_4_1_100_To_0_DividedBy_13 {

	
	
	
	
	public static void main(String[] args) {
		
		
System.out.println("Yuzden kucuk 13'e bolunen sayilar asagida listelenmistir");	
		int toplam=0;
for (int i = 100; i >= 0; i--) {
	
	
	if (i%13==0) {
		System.out.println(i+" ");
		
	
		toplam+=i;
		
	}
	
	

	
}

System.out.println();
System.out.println("Yuzden kucuk 13'e bolunen sayilarin toplami: "+toplam);
	}

}
