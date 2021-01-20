import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz zdanie a ja je wyswietle w poziomie");
        System.out.println("Wprowadz zdanie : ");
        String zdanie = sc.nextLine();

        for(int i = 0; i < zdanie.length();i++){
           System.out.println(zdanie.charAt(i));

        }

    }
}