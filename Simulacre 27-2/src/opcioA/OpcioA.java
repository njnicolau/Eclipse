package opcioA;

import java.util.Scanner;

public class OpcioA {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		int nom, edat;
		System.out.print("Nom? ");
		nom=teclat.nextInt();
		System.out.print("Edat? ");
		edat=teclat.nextInt();
		System.out.println(nom);
		System.out.println(edat);
		if (edat>=18)
			System.out.println("eres major d'edat");
		else
			System.out.println("eres menor d'edat");
		teclat.close();
	}

}
