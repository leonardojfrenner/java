import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] media = new double [n];
		
		for(int i = 0 ;i<nome.length;i++) {
			System.out.println("Digite o nome, perimeira e segunda nota do "+(i+1)+"º aluno:");
			nome[i]= sc.nextLine();
			nota1[i]=sc.nextDouble();
			nota2[i]=sc.nextDouble();
			sc.nextLine();
			media[i] = (nota1[i] + nota2[i])/2;
		}
		System.out.println("ALUNOS APROVADOS:");
		for(int i = 0 ;i<nome.length;i++) {
			if(media[i] >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		
		
		
		
		sc.close();
	}

}
