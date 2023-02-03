package string1;

public class string02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program 01

				// "Salleri" == "Salleri"

				String cityA = "Salleri";
				String cityB = "Okhaldhunga";
				String cityC = "Salleri";
				

				boolean data = cityA.equals(cityC);
				boolean data1= cityA.equals(cityB);
				System.out.println(data);
				System.out.println(data1);
				if (data) {
					System.out.println("Both city are same");
				}
				else {
					System.out.println("Both city are different");
				}
					if (data1) {
						System.out.println("both city has different name");
					}
						else {
							System.out.println("both city are similar");
						}
					//Program 02
					// compare cityA and cityC with ternary operator
					
					String data2 = cityA.equals(cityC) ? "similar city":"different city";
					System.out.println(data2);
					String data3=cityA.equals(cityB)? "similar city":"different city";
					System.out.println(data3);
					
					//Program 03
					// Escaspe character
					
					String escape = "Best quote \"This time will be disappear\""; 
					System.out.println(escape);
					
					
					
					// Program 04
					
					String cityD = "Pokhara";
					boolean data4 = cityD.startsWith("pok");
					boolean data5 = cityD.startsWith("P");
					System.out.println(data4);
					System.out.println(data5);
					
					// Program 05
					String cityE = "Mustang";
					boolean data6 = cityE.endsWith("ang");
					boolean data7 = cityE.endsWith("Ang");
					System.out.println(data6);
					System.out.println(data7);
					
					// Program 06
					
					String sen1 = "I am learning selenium";
					boolean data8 = sen1.contains("selenium");
					System.out.println(data8);
					boolean data9 =sen1.contains("am");
					System.out.println(data9);
					
					
					// Program 07
					String sen2 = "I am learning java with selenium and and java is great";
					String data10 = sen2.replace("s", "z");
					System.out.println(data10);
					
					String data11 = sen2.replaceAll("java", "javascript");
					System.out.println(data11);
					
					
					String data12 = sen2.replace("selenium", "c++");
					System.out.println(data12);
					
					
					//Program 08
					
					String cityF = "Hetauda";
					// index starts from zero and length () -1 is always a last index.
					// 0   1   2   3   4   5   6   
					// H   e   t   a   u   d   a-------> but total length is  7.
					char a1 = cityF.charAt(3);
					System.out.println(a1);	 // a
					System.out.println(cityF.length());

					
					String cityG = "Dharan";
					//  0    1    2    3   4   5  
					//  D    h    a    r   a   n 
					int extent = cityG.length();
					System.out.println(extent);
					System.out.println(cityG.length());
					
					for(int x = 0 ; x < extent ; x++) { //1 // 2 // 3 // 4 // 5 // 6// 7 
						System.out.println(cityG.charAt(x));
						
						//reverse string 
						
						String cityH = "Dharan";
						int extent1= cityH.length();
						System.out.println(extent1);
						
						for (int y =extent1 -1 ; y >=0 ;y--) {  // 0// 1// 2 //3 //4 //5//6
							System.out.println(cityH.charAt(y));
						}
					
					}
					
					
					String cityI = "Biratnagar";
					int extent2 =cityI.length();
					System.out.println(extent2);
					
					//Regular display
					
					for(int z= 0; z <extent2 ; z++) {
						System.out.println(cityI.charAt(z));
						
						//Reverse display
						for (int i = extent2 -1; i >=0 ; i--) {
							System.out.println(cityI.charAt(i));
						}
						
						
					}
					
					
					
					}
	
	}


