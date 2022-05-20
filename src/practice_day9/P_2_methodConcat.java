package practice_day9;

public class P_2_methodConcat {

	public static void main(String[] args) {
		
	concat("h","a","c","e","r");
	concat ("haným"," basrili"," qa");
			
		
	}
	
	
	
	
	public static void concat(String... str) {
		
		
		String yeniStr="";
		
		for (String w : str) {
			
			yeniStr=yeniStr.concat(w);
			
		}
		
	System.out.println(yeniStr);
		
		
	}
	

}
