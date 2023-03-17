package interlink;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	   TestClass.divideByZeroExcception();  
			 }
	}
			class TestClass {
			  public static  void divideByZeroExcception() {
			    throw new ArithmeticException("Trying divide by zero");
			   }	
			
	}


