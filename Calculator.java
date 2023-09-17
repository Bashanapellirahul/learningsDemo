package pkg1;

public class Calculator {
	
	int a;
	int b;
	
	public void sum(int i , int j) {
		System.out.println("the sum of i and j is : "+(i+j));
		System.out.println("the sum of a and b in sum method is = "+(a+b));
		
	}
	
	public void multi(int i, int j) {
		System.out.println("the sum of i and j is : "+(i*j));
	}
	
	public void name(String Name) {
		
		
		System.out.println("the name of the person is  "+Name);
	
	}
	
	

	public static void main(String[] args) {
		
		Calculator ob = new Calculator();
		
		ob.a=5;
		ob.b=12;
		
		ob.sum(10,30);
		
		ob.multi(10, 20);
		
		ob.name("Rahul");
		
		
		
		
		
		

	}

}
