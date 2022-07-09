package program;

public class VariProgram {
	
	//Instance Variable
	
	int a = 10;
	
	//Static Variable
	static int b = 20;
	
	
	//Method 
	 void add() {
		 //Local Variable
		 int c = 10;
		 int d = 20;
		 
		 System.out.println(c+d);
		 
	}
	 
	public static void main(String[] args) {
		
		System.out.println(b);
				
		VariProgram vp = new VariProgram();
		
		System.out.println(vp.a);
		
		vp.add();
		
	}

}
