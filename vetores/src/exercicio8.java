import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double media=0,soma=0;
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		int aux=0;
		int[] vet = new int[n];
		
		for(int i=0;i<vet.length;i++) {
		System.out.print("Digite um numero:");
		vet[i]= sc.nextInt();
		sc.nextLine();
		if(vet[i]%2==0) {
				soma += (double) vet[i];
				aux++;
			}
		}
		media = soma/aux;
		if(aux ==0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			System.out.printf("MEDIA DOS PARES: %.1f ",media);
		}
		
		sc.close();
	}

}
