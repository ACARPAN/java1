package interlink;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exceptions
		// try catch // finally block
		// throw and throws keyword

		System.out.println("Namaste");
		try {
			System.out.println(10 / 0);

		} catch (ArithmeticException e) {
			System.out.println("Incorrect input");
		}
		System.out.println("Fix later");

		/*
		 * * try { * * } catch(){ * * } * *
		 */

		/*
		 * * try { *
		 * 
		 * } catch(){ *
		 * 
		 * } finally { * * } * *
		 */
		// chinmaydeshpande010@gmail.com // sarikapansare@gmail.com
		// mayurikatwe@gmail.com
		// chinmayshirishmanoharvasudevraoganpatrao@email.com

		try {
			// I am writing something which may raise exception System.out.println(10/5);
		} catch (ArithmeticException e) {
			System.out.println("Exception handled successfully . incorrect input");
		} finally {
			System.out.println("I  will exectuted at last and always expected");
		}

	}

}
