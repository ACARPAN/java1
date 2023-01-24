package java1;

public class Module {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello, world");
//define variables
int x= 30;
int y= 15;
int z=x+y;
System.out.println(x);
System.out.println(y);
System.out.println(x+y);

//Arithmetic operation
//+ -> addition 
// - -> subtraction
// * -> multiplication
// / -> division 
// % -> modulus

System.out.println(x+y);
System.out.println(x-y);
System.out.println(x*y);
System.out.println(x/y);
System.out.println(x%y);

//calling the function

Evaluate(20,10);
Evaluate(100,50);
	}





static void Evaluate(int a, int b){
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	

}


}
