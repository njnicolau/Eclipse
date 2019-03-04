package hola;
import java.util.Scanner;
public class Clase1 {
	public static void main(String[] parametro) {
		int nota, suma;
		Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix nota: ");
        nota = teclat.nextInt();
        if (nota < 5) {
        	System.out.print("Estas suspés, esforçat més!");
        }
        if (nota >=5) ;
        	System.out.println("Estas aprovat");
        	System.out.print("Enhorabona!");
        
    }
}
