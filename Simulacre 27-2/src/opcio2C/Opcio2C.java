package opcio2C;

import java.util.Scanner;

public class Opcio2C {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		int temperatura, humitat;
		System.out.print("Temperatura: ");
		temperatura=teclat.nextInt();
		System.out.print("Humitat: ");
		humitat=teclat.nextInt();
		if (temperatura < 19)
			System.out.println(temperatura + " és massa fred");
		else
			if (temperatura > 26)
				System.out.println(temperatura + " és massa calor");
		if (humitat < 40)
			System.out.println(humitat + " és poca humitat");
		else
			if (humitat > 70)
				System.out.println(humitat + " és massa humitat");
		if (temperatura >=19 && temperatura <=26 && humitat >=40 && humitat <=70)
			System.out.println("El nivell és comfortable");
		else
			System.out.println("El nivell no és comfortable");
		teclat.close();
	}

}
