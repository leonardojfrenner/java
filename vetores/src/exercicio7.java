import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double media,soma = 0;
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vet = new double[n];
		for(int i=0;i<vet.length;i++) {
			System.out.print("Digite um numero: ");
			vet[i] =sc.nextDouble();
			sc.nextLine();
			soma += vet[i];
		}
		media = soma/vet.length;
		System.out.printf("\nMédia do vetor: %.3f \nELEMENTOS ABAIXO DA MÉDIA:\n",media);
		
		
		for (int i=0;i<vet.length;i++) {
			if(vet[i]<media) {
				System.out.printf("%.1f%n",vet[i]);
			}
		}
		
		sc.close();
	}
}
