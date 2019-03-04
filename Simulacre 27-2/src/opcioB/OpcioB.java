package opcioB;

import java.util.Scanner;

public class OpcioB {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		int nom, edat;
		System.out.print("Nom? ");
		nom=teclat.nextInt();
		System.out.print("Edat? ");
		edat=teclat.nextInt();
		System.out.print("Hola " + nom + ", tens " + edat + " anys, per tant eres ");
		if (edat>=18)
			System.out.print("major d'edat");
		else
			System.out.print("menor d'edat");
		teclat.close();
	}

}
