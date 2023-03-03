package Practice11;

public class prc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// index and char
		// String City = "Lalitpur";
		// int a = City.indexOf('a');
		// System.out.println(a);
		// char[] A = City.toCharArray();
		// for (int i = 0; i <= A.length; i++) {
		// System.out.println(A[i]);
		// }
		// Reverse

		// String City1 = "Kathmandu";
		// String rev1 = "";
		// for (int j = 0; j <City1.length(); j++) {
		// rev1 = City1.charAt(j)+ rev1;
		// System.out.println(rev1);

		// }
		// System.out.println(rev1);

		int[] num = { 1, 3, 5, 7 };
		int sum = 0;
		for (int c = 0; c < num.length; c++) {
			sum = sum + num[c];
		}
		System.out.println(sum);
		// Array
		int[][] numbs = { 
				{ 10, 20, 30 }, 
				{ 11, 22, 33 }, 
				{ 111, 222, 333 } 
				};

		for (int i = 0; i < numbs.length; i++) {
			int numba [] = numbs[i];
			for (int l = 0; l < numba.length; l++) {
				System.out.println(numba[l]);
			}
		}
		int table [][][]= {
				{
					{1,2,3,4},
					{5,6,7,8}
				},
				{
				{7,8,9,10},
				{11,12,13,14}
				}
		
	};
		
		for (int [][]t1:table ) {
			for (int [] t2:t1) {
				for(int t3:t2) {
				System.out.println(t3);
			}
		}
	}
}
}
