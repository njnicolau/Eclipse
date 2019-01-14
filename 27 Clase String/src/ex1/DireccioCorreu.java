package ex1;
import java.util.Scanner;

public class DireccioCorreu {
	private String direccio;
	private DireccioCorreu(){
		Scanner teclat = new Scanner(System.in);
		System.out.print("Insereix adreça de correu electronic: ");
		direccio = teclat.next();
		teclat.close();
	}
	public boolean teArroba() {
		if (direccio.indexOf("@")==-1)
			return false;
		else
			return true;
	}
	public static void main(String[] args) {
		DireccioCorreu ex1 = new DireccioCorreu();
		System.out.print("Té arroba? " + ex1.teArroba());
	}

}