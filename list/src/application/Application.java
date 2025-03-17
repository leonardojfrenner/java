package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.Funcionario;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n,id,select;
		String nome;
		double salario,perc;
		
		List<Funcionario> funcionarios = new ArrayList<>();

		
		System.out.print("Quantos funcionarios quer cadastrar? ");
		n = sc.nextInt();
		System.out.println();
		
		for(int i = 0;i < n ; i++) {	
			System.out.printf("FUNCIONARIO # %s ", i+1);
			System.out.print("ID: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("NOME: ");
			nome = sc.nextLine();
			System.out.print("SALARIO: ");
			salario = sc.nextDouble();
			System.out.println();
			Funcionario funcionario = new Funcionario(id,nome,salario);
			funcionarios.add(funcionario);
		}
		System.out.print(" Entre com o ID do funcionario para aumentar seu salario: ");
		select = sc.nextInt();		
		sc.nextLine();
		
		Integer pos = posicao(funcionarios,select);
		
		if (pos == null) {
			System.out.println("Esse id não existe!");
		} 
		else {
			System.out.print("Entre com a porcentagem: " );
			perc = sc.nextDouble();
			funcionarios.get(pos).aumentarSalario(perc);
		}
		for (Funcionario x : funcionarios ) {
			System.out.println(x);
		}
		
		sc.close();
}
	
	public static Integer posicao(List<Funcionario> list,int id) {
		for (int i = 0; i < list.size() ;i++ ) {
			if(list.get(i).getId()==id) {
				return i;
			}			
		}
		return null;
	}

}
