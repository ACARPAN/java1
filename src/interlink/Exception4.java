package interlink;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = new int[3];
		x[0] = 00;
		x[1] = 10;
		x[2] = 20;

		try { // try catch block to check and handle exceptions

			for (int i = x.length-5; i <= 0; i--) {

				System.out.println(x[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
	   //using printStackTrace() method to display where exception occurred;
			
			e.printStackTrace();
		} 
		finally {
			System.out.println("I will always handle exceptions");
		}
		System.out.println("continue on next execution");

	}

}
