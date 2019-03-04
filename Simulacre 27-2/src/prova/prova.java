package prova;

import java.util.Scanner;

public class prova {

	public static void main(String[] args) {
		java.util.Scanner teclado=new Scanner(System.in);
		int año;
		
		año=1500;
		
		while (año<=2020&&año>=1500) {
			if (año%100==0) {
			
			}	
			else {
				if (año%4==0) {
					System.out.println(año);
				}
				else {
					if (año%400==0) { 
						System.out.println(año);
					}
				}		
			}
		año++;
		}
		
		teclado.close();
		
	}

}
