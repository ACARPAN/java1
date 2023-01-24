package java1;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("print welcome");
int A = 10;
int Z = 20;
System.out.println(A+Z);
System.out.println(A-Z);
System.out.println(A*Z);
System.out.println(A/Z);
System.out.println(A%Z);
System.out.println(A);

EvaA();
EvaB (5,10);
int Z1 = EvaC(10,20);
System.out.println(Z1);
System.out.println(Z1 + 20);
System.out.println(Z1 -10);

int Z2= Mul(6,12);
System.out.println(Z2);
System.out.println(Z2 +100);
System.out.println(Z2-50);
System.out.println(Z2*10);
System.out.println(Z2/20);

int x=100;
System.out.println(x>=100);

System.out.println(2==2 && 3!=2);
System.out.println(3>=4 || 5!=5 );

int data=40;
if(data> 50 && data<=40) {
	System.out.println("age below 40 qualified");
}
	else {
		System.out.println("age above 40 qualified");
		
	}
int month=2;
switch (month) {
case 1:
	System.out.println("January");
	break;
case 2:
	System.out.println("February");
	break;
case 3:
	System.out.println("March");
	break;
	default: {
		System.out.println("not valid month");
	}
}

String weathear= "summer";
switch (weathear) {
case "winter":
	System.out.println("cold");
case "summer":
	System.out.println("hot"); 
	
	for (int K =1; K<=5; K++) {
		System.out.println(K);
	}
	
	for (int j=5; j>=1; j--){
		System.out.println(j); 
		if (x==3) {
		break;
		}
	}
	//while loop for table of 2
	
	int i1=2;
	while(i1 <=2) {
		System.out.println(i1);
		i1=i1+2;
	}
}
	



}
	

static void EvaA() {
	System.out.println(10+10);
}
	static void EvaB (int x, int y)	{
		System.out.println(x+y);
	}
	static int EvaC(int x, int y) {
		return (x+y);
	}
	static int Mul (int x, int y) {
		return (x*y);
	}
	
	
	

	}
	


