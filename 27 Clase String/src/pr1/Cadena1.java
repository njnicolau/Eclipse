package pr1;
import java.util.Scanner;
public class Cadena1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena1, cadena2;
		System.out.print("Inserta primera cad: ");
		cadena1 = teclado.next();
		System.out.print("Inserta segona cad: ");
		cadena2 = teclado.next();
		if (cadena1.equals(cadena2))
			System.out.println("Les cadenes són exactament iguals");
		else
			System.out.println("Les cadenes són distintes");
		
		if (cadena1.equalsIgnoreCase(cadena2))
			System.out.println("Les cadenes són exactament iguals (ignorant les minúscules/majúscules");
		else
			System.out.println("Les cadenes són distintes");
		 if (cadena1.compareTo(cadena2)==0) {
	            System.out.println(cadena1+" es exactamente igual a "+cadena2);
	        } else {
	            if (cadena1.compareTo(cadena2)>0) {
	                System.out.println(cadena1+ " es mayor alfabéticamente que "+cadena2);
	            } else {
	                System.out.println(cadena2+ " es mayor alfabéticamente que "+cadena1);            
	            }
	        } 
		 int posi=cadena1.indexOf(cadena2);
	        if (posi==-1) {
	            System.out.println(cadena2+" no está contenido en "+cadena1);
	        } else {
	            System.out.println(cadena2+" está contenido en "+cadena1+" a partir de la posición "+posi);
	        }
		 System.out.println("El tercer caracter de la primera cadena és: " + cadena1.charAt(3));
		 System.out.println("La llargaria de la primera cadena és: " + cadena1.length());
		 System.out.println("Els tres primers caracters de la cadena1 són: " + cadena1.substring(0, 3));
		 
		 System.out.println("Posant la primera cadena tot a majúscules: " + cadena1.toUpperCase());
		 System.out.println("Posant la primera cadena tot a minúscules: " + cadena1.toLowerCase());
		 teclado.close();
	}

}
