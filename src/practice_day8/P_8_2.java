package practice_day8;

public class P_8_2 {

	public static void main(String[] args) {
	
		int arr[]= {1,2,7,4,4,3,2,1,};
		
		boolean simetrik=false;
		
		for (int i = 0; i < arr.length/2; i++) {
			
			if (arr[i]==arr[arr.length-1-i]) {
				
				simetrik=true;
				
			}
			else {simetrik=false;
			break;}
		}
		
	System.out.println(simetrik);

	}

}
