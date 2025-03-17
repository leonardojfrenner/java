import java.util.Locale;
import java.util.Scanner;

import entities.Pensionista;

public class Desafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas vao alugar? ");
		int quarto,n = sc.nextInt();
		sc.nextLine();
		
		Pensionista[] p = new Pensionista[10];
		
		for(int i = 1;i<=n;i++) {
			
			System.out.printf("ALUGUEL %d#: \n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email:"); 
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			quarto = sc.nextInt();
			sc.nextLine();
			
			p[quarto] = new Pensionista(nome,email);
		}

		System.out.println("Quartos alugados: ");
		
		for(int i = 0;i<p.length;i++)  {
			if(p[i] != null) {
			System.out.printf("%d : %s \n",i,p[i]);
			}
		}
		
		
		sc.close();
	}

	}

