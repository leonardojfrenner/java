import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantidade=0;
		System.out.println("Quantos numeros vc vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		int[] vet = new int[n];
		
		for(int i =0;i<vet.length;i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("NUMEROS PARES: ");
		for(int i =0;i<vet.length;i++) {
			if(vet[i]%2==0) {
				System.out.print(vet[i]+" ");
				quantidade++;
			}
		}
		System.out.println("\nQuantidade de pares = " + quantidade);
		sc.close();
	}

}
