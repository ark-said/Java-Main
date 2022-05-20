package practice_day4;

public class P_4_9_PartTwo {

	public static void main(String[] args) {
		int harf=65;
		for (int baba = 0; baba < 6; baba++) {
			for (int evlat = 0; evlat <= baba; evlat++) {
				System.out.print((char)(harf+baba)+" ");
			}
				System.out.println();
			}
		}
				
	}


