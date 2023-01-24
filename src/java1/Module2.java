package java1;

public class Module2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calling the second function
		EvaA();
		EvaA();
		EvaA();

		EvaB(100,50);
		EvaB(18,9);
		EvaB(16,32);

		int x2=EvaC(12,6);
		System.out.println(x2);
		System.out.println(x2+10);
		System.out.println(x2*0.10);
		System.out.println(x2/2);

		int y2= Sub(10,5);
		System.out.println(y2);
		int y3= Sub(200,100);
		System.out.println(y3);
		System.out.println(y3+y3);
		
		int z1= Mul(20,10);
		System.out.println(z1);
		System.out.println(z1*10);
		System.out.println(z1-50);
		
		int z2= Div(50,25);
		System.out.println(z2);
		System.out.println(z2-10);
		System.out.println(z2+20);
		System.out.println(z2/2);
		System.out.println(z2*5);

		}
			//Function without parameter and without return
			
			static void EvaA() {
				System.out.println(10+10);
			}

			//Function with parameter and without return type
			
			static void EvaB(int x, int y) {
				System.out.println(x+y);
			}
			
			//Function with parameter and return type
			//Difference..........>>> $1000 given and showing $1000
			
			static int EvaC(int x, int y) {
				return (x+y);
				
		}
			
			//Multiplication
			
			static int Mul(int x, int y) {
				return (x*y);
				
			}
			
			//Division
			
			static int Div(int x, int y) {
				return (x/y);
				
			}

			//Subtraction
			static int Sub(int x, int y) {
				return (x-y);
				
			}
			
	}


