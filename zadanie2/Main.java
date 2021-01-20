import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String imie, nazwisko;
		System.out.println("Podaj imie: ");
		imie = sc.nextLine();
		System.out.println("Podaj nazwisko: ");
		nazwisko = sc.nextLine();
		
		System.out.println("Imie ma "+imie.length()+" znakow, a nazwisko ma "+nazwisko.length()+" znakow");
	}
}