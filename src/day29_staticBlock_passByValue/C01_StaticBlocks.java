package day29_staticBlock_passByValue;

public class C01_StaticBlocks {
	

	static {
		System.out.println("Static blok main methoddan bile once calisir.");
		
		
	}

	public static void main(String[] args) {
	
		System.out.println("Java once main method calisir");
		
	}

	
	static {
		
		System.out.println("Static blok nereye yazilirsa yazilsin en once calisir");
		
	}
}
