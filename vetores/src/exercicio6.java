import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vao ter cada vetor ? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] vetA = new int[n];
		int[] vetB = new int[n];
		int[] vetC = new int[n];
		
		for (int i =0;i<vetA.length;i++) {
			System.out.print("Digite um valor para o vetor A:");
			vetA[i]= sc.nextInt();
			sc.nextLine();
		}
		for (int i =0;i<vetB.length;i++) {
			System.out.print("Digite um valor para o vetor B:");
			vetB[i]= sc.nextInt();
			sc.nextLine();
			vetC[i]= vetA[i]  + vetB[i];
		}
		for (int i =0;i<vetC.length;i++) {
		System.out.println("VETOR RESULTANTE: " + vetC[i]);	 
		}	
		sc.close();
	}

}
