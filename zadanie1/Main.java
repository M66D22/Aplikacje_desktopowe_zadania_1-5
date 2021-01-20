import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int wybor;
		
		System.out.println("Wybierz figure geometryczna ktora mam narysowac");
		System.out.println("1) Kwadrat, 2) Okrag, 3) Trojkat");
		System.out.println("Wybor: ");
		
		wybor = sc.nextInt();
		
		if (wybor == 1) {
			System.out.println("**********");
			System.out.println("*        *");
			System.out.println("*        *");
			System.out.println("*        *");
			System.out.println("**********");
		}
		if (wybor == 2) {
			System.out.println("  ***  ");
			System.out.println(" *   * ");
			System.out.println("*     *");
			System.out.println(" *   * ");
			System.out.println("  ***  ");
		}
		if (wybor == 3) {
			System.out.println("    **    ");
			System.out.println("   *  *   ");
			System.out.println("  *    *  ");
			System.out.println(" *      * ");
			System.out.println("**********");
		}
		else{
			System.out.println("Podales zly numer!");
		}
	}
}