import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você vai digitar? ");
        int pessoaMaisVelha = 0, aux = 0;
        int n = sc.nextInt();
        sc.nextLine();
        String[] nome = new String[n];
        int[] idade = new int[n];
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome:");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();

        }
        pessoaMaisVelha = idade[0];

        for (int i = 0; i < nome.length; i++) {
            if (idade[i] > pessoaMaisVelha) {
                pessoaMaisVelha = idade[i];
                aux = i;
            }
        }

        System.out.println("Pessoa mais velha: " + nome[aux]);
        sc.close();
    }

}
