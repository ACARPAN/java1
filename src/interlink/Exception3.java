package interlink;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a = 25;
		int b = 0;
		System.out.println("Namaste");
		//try catch block to check and handle exceptions
		
		try {
			System.out.println("In try");
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
		// using printStackTrace() method  to display where exception occurred
			System.out.println("In catch");	
			e.printStackTrace();
			String a1 = e.toString();
			System.out.println(a1);
			
		}
		//moving forward to next steps
		System.out.println("Done for next step");
	}

}
