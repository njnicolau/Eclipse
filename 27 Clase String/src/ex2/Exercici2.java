package ex2;
import java.util.Scanner;

public class Exercici2 {
	private String cadena;

	private Exercici2() {
		Scanner teclat = new Scanner(System.in);
		System.out.print("Inserta una cadena de caracters: ");
		cadena = teclat.next();
		teclat.close();
	}
	private void imprimirMeitatCadena() {
		System.out.println(cadena.substring(0, cadena.length()/2));
	}
	
	private void imprimirUltimCaracterCadena() {
		System.out.println(cadena.charAt(cadena.length()-1));
	}
	
	private void imprimirCadenaAlReves() {
		for (int posicio = cadena.length()-1;posicio>=0;posicio--) {
			System.out.print(cadena.charAt(posicio));
		}
		System.out.println();
	}
	
	private void imprimirCaracterGuio() {
		for (int posicio = 0;posicio<cadena.length();posicio++) {
			System.out.print(cadena.charAt(posicio));
			if (posicio != cadena.length()-1)
				System.out.print("-");
		}
		System.out.println();
	}
	private void imprimirQuantitatVocals() {
		int vocals=0;
		for (int posicio = 0;posicio<cadena.length();posicio++) {
			if (cadena.charAt(posicio)=='a'||cadena.charAt(posicio)=='e'||cadena.charAt(posicio)=='i'||cadena.charAt(posicio)=='o'||cadena.charAt(posicio)=='u'||cadena.charAt(posicio)=='A'||cadena.charAt(posicio)=='E'||cadena.charAt(posicio)=='I'||cadena.charAt(posicio)=='O'||cadena.charAt(posicio)=='U')
				vocals++;
		}
		System.out.println("Hi han "+vocals + " vocals");
	}
	
	private void imprimirPalindrom() {
		for (int posicio = 0;posicio<cadena.length()/2;posicio++) {
			if (cadena.charAt(posicio)!=cadena.charAt(cadena.length()- 1 -posicio)) {
				System.out.println("No es palindrom");
				break;
			}

		}
	}
	
	
	public static void main(String[] args) {
		Exercici2 objecte = new Exercici2();
		objecte.imprimirMeitatCadena();
		objecte.imprimirUltimCaracterCadena();
		objecte.imprimirCadenaAlReves();
		objecte.imprimirCaracterGuio();
		objecte.imprimirQuantitatVocals();
		objecte.imprimirPalindrom();
	}

}
