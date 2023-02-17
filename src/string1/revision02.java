package string1;

import java.util.Arrays;

public class revision02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbs[] = { 1, 5, 10 };
		for (int a = 0; a < numbs.length; a++) {
			System.out.println(numbs[a]);
		}

		int num[] = { 10, 20, 30 };
		for (int b : num) {
			System.out.println(b);
		}
		// Multi Array
		int aa[][] = { 
				{ 11, 111, 111 }, 
				{ 22, 222, 2222 }, 
				{ 33, 333, 3333 } 
				};

		for (int b = 0; b < aa.length; b++) {
			// System.out.println(b)//0 /1 /2
			// System.out.println(aa[b]);
			// String x = Arrays.toString(aa [b]);
			// System.out.println(x);
			//int[] cc = aa[b];
			//for (int i = 0; i < cc.length; i++) {
				//System.out.println(aa[i]);
			//}

			//for each
			for (int[] bb:aa) {
				for (int b3:bb) {
					System.out.println(b3);
				}
				
				
			}
		}
		int a2 [][][]= {
				{
					{10, 20, 30},
					{40, 50, 60},
					{70,80,90}
				},
				{
				{11,22,33},
				{44,55,66},
				{7,88,99}
				
		        },
				{
		        	{5,10,15},
		        	{20,25,30},
		        	{40,50,60}
				}
		};
		
		for (int a22=0; a22<a2.length; a22++) {
			System.out.println(a2[a22]);
		
		int a3 [][]= a2[a22];
		for (int a4=0; a4<a3.length; a4++) {
			int a44 []= a3[a4];
			for (int a5=0; a5<a44.length; a5++) {
				System.out.println();
			}
			
		}
		}
		}
	}


