import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual'è il tuo nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual'è il tuo cognome?");
        String cognome = scanner.nextLine();

        System.out.println("Qual'è la tua età?");
        int eta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Sei impegnato?");
        boolean impegnato = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("In Quale città vivi?");
        String city = scanner.nextLine();

        System.out.println("Ciao " + nome + " " + cognome);
        System.out.println("Hai " + eta + " anni");
        System.out.println("Sei impegnato? " + impegnato);
        System.out.println("Vivi a " + city);

    }
}