import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char[][] matriz = new char[4][4];

		/*
		 * for (int i = 0; i < matriz.length; i++) { for (int j = 0; j <
		 * matriz[i].length; j++) { matriz[i][j] = 'x';
		 * System.out.print(matriz[i][j] + " | "); } System.out.println(""); }
		 * 
		 * String nombre[][] = new String[4][4]; for (int i = 0; i <
		 * nombre.length; i++) { for (int j = 0; j < matriz[i].length; j++) {
		 * nombre[i][j] = "Juan "; } } System.out.println("");
		 * System.out.println("");
		 * 
		 * for (int i = 0; i < nombre.length; i++) { for (int j = 0; j <
		 * matriz[i].length; j++) {
		 * System.out.print(nombre[i][j].charAt(j)+" | "); }
		 * System.out.println("");
		 * 
		 * }
		 */
		int sumaTotal = 0;

		int m[][] = new int[4][4];
		/*
		 * int prueba[][]={ {1,1,1,1}, {2,2,2,2}, {3,3,3,3} };
		 */
		int sumas[] = new int[m.length];

		int j = 0;

		for (int i = 0; i < m.length; i++) {
			for (j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 10);
				sumaTotal += m[i][j];
				System.out.print(m[i][j] + " | ");
			}
			System.out.println("");
		}
		System.out.println("");
		int sumf;
		for (int i = 0; i < m.length; i++) {
			sumf = 0;
			for (j = 0; j < m[i].length; j++) {
				sumf = sumf + m[i][j];
			}
			System.out.println("Suma fila " + (i + 1) + " es: " + sumf);
		}
		System.out.println("");
		int sumc;
		for (int i = 0; i < m[0].length; i++) {
			sumc = 0;
			for (j = 0; j < m.length; j++) {
				sumc = sumc + m[j][i];
			}
			System.out.println("Suma columna " + (i + 1) + " es: " + sumc);
		}
		System.out.println("");

		System.out.println("Suma total: " + sumaTotal);
	}
}
