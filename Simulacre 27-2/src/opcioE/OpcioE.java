package opcioE;

public class OpcioE {

	public static void main(String[] args) {
		int any;
		any=1500;
		while(any<=2020) {
			if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0)))
				System.out.println(any);
			any = any +4;
		}
	}
}
