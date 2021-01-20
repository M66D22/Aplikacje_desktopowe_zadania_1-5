import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String zdanie;
		System.out.println("Podaj slowo: ");
		zdanie = sc.next();
		System.out.println("Pierwsza litera slowa: "+zdanie.charAt(0)+" ostatnia litera slowa: "+zdanie.charAt(zdanie.length()-1));
	}
}