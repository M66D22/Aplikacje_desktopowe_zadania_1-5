import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String zdanie;
		System.out.println("Podaj zdanie a ja zamienie je na duze litery");
		zdanie = sc.nextLine();
		System.out.println("Twoje zdanie wielkimi literami wyglada tak: " + zdanie.toUpperCase());
	}
}