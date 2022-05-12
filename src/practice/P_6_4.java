package practice;

public class P_6_4 {

	public static void main(String[] args) {
	
		// Write a method that accepts a 2 dimensional array and finds the max value
		
	int arr[][]= {{1,2,-3},{41,55},{-61,-17,80}};
	
	System.out.println(maxDegerBul(arr));
	
	
	}

	private static int maxDegerBul(int[][] arr) {
	int max=arr[0][0];
	for (int kat = 0; kat < arr.length; kat++) {
		for (int daire = 0; daire < arr[kat].length; daire++) {
			
			if(arr[kat][daire]>max) { max=arr[kat][daire];
			}
		}
	} return max;
		
		
	}

}
