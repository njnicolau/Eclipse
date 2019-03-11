package prova;
import java.util.*;
public class prova {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int bucle,nota,mayor,menor;
		bucle=1;
		mayor=0;
		menor=0;
		while(bucle<=10) {
			System.out.print("Ingrese nota del alumno");
			nota=teclado.nextInt();
			if(nota>=7)
				mayor++;
			if(nota<7)
				menor++;
			bucle++;
		}
		System.out.print("Notas mayor que 7:");
		System.out.println(mayor);
		System.out.print("Notas menor que 7:");
		System.out.println(menor);
	}
}
