import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		double numero=0;
		int index=0;
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vet = new double[n];
		
		for(int i = 0;i<vet.length;i++) {
			System.out.println("Digite um valor: ");
			vet[i] = sc.nextDouble();
		}
		for(int i = 0;i<vet.length;i++) {
			if(vet[i]>numero) {
				numero = vet[i];
				index = i;
			}
		}
		System.out.printf("Maior numero: %.2f%n Posição do maior valor: %d",numero,index);
		sc.close();
	}

}
