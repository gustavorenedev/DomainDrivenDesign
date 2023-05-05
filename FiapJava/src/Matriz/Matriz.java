package Matriz;

public class Matriz {
	public static void main(String[] args) {
			
			int[][] matriz = new int [3][3];
			
			matriz[0][0] = 1;
			matriz[0][1] = 2;
			matriz[0][2] = 3;
			
			matriz[1][0] = 5;
			matriz[1][1] = 6;
			matriz[1][2] = 7;

		
			matriz[2][0] = 9;
			matriz[2][1] = 10;
			matriz[2][2] = 11;


			System.out.printf("Matriz[0][1]: %d \n", matriz[0][1]);
			
			
			int[][] m = {{1,2}, {3,4}, {0}};
			
			System.out.println(m[2][1]);
	}
}
