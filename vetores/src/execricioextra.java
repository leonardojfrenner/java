import java.util.Locale;
import java.util.Scanner;

public class execricioextra {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] nome= new String[n];
		int[] idade = new int[n];
		int pessoaIdosa,aux;
		for(int i =0;i<nome.length;i++) {
			System.out.printf("Dados da %da pessoa\n", i+1);
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
		}
		
		pessoaIdosa = idade[0];
		aux=0;
		
		for(int i =0;i<nome.length;i++) {
			if (idade[i]>pessoaIdosa) {
				pessoaIdosa = idade[i];
				aux = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA "+ nome[aux]);
		
		sc.close();
	}

}
