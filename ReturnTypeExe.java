package pkg1;

public class ReturnTypeExe {
	
	
	public static String Name(String fname, String lname ) {

		return (fname+lname);
	
	}
	
	public static int Nums(int a, int b, int c) {
		
		return a+b+c;
	}

	public static void main(String[] args) {
		
		System.out.println(Name("rahul ","bashanapelli"));
		
		System.out.println(Nums(10,20,30));
		
	}

}
