import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;


public class exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 0;
		double soma=0.0,media=0.0,perc = 0.0;
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();	
		
		Pessoa[] p = new Pessoa[n];

		System.out.print("Digite os dados da ");
		for (int i=0;i<p.length;i++) {
			System.out.println(i+1 +"ªPessoa: Nome, Idade, Altura");
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			sc.nextLine();
			double altura = sc.nextDouble();
			sc.nextLine();
			
			p[i] = new Pessoa(nome,idade,altura);
			soma += p[i].getAltura();
		}
		
		System.out.println("Dados das pessoas:" );
		for(int i=0; i<p.length;i++) {
			System.out.println(i+1+"ª"+ p[i]);
			
			if(p[i].getIdade()<16) {
				quantidade++;
			}
		}
		
		media = soma/p.length;
		System.out.printf("\nMédia: %.2f%n", media);
		
		perc = ((double) quantidade / p.length) *100;
		System.out.printf("Porcentagem de pessoas menores de idade: %.2f  ", perc);
		
	
		sc.close();
	}
}
