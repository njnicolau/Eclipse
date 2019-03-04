package opcioC;

import java.util.Scanner;

public class OpcioC {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		int nom, contrasenya;
		System.out.print("Nom? ");
		nom=teclat.nextInt();
		System.out.print("Contrasenya? ");
		contrasenya=teclat.nextInt();
		if (nom==1111&&contrasenya==1234)
			System.out.print("Les credencials " + nom + "/" + contrasenya + " són correctes");
		else
			System.out.print("Les credencials " + nom + "/" + contrasenya + " no són correctes");
		teclat.close();
	}

}
