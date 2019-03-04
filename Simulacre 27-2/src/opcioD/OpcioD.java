package opcioD;

import java.util.Scanner;

public class OpcioD {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		int nParells, bucle;
		System.out.print("Numero de parells? ");
		nParells=teclat.nextInt();
		bucle = 1;
		while(bucle<=nParells) {
			System.out.print(bucle*2);
			bucle++;
			if (bucle<=nParells)
				System.out.print("-");
		}
		teclat.close();
	}
}
