package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import entities.Candidato;

public class Program {

	public static void main(String[] args) {
		
		List<Candidato> list = new ArrayList<>();
		Map<String,Integer> apuracao = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line!= null) {
				
				String[] fields = line.split(",");
				String nome = fields[0];
				int votos = Integer.parseInt(fields[1]);
				if (apuracao.containsKey(nome)) {
                    apuracao.put(nome, apuracao.get(nome) + votos);
                } else {
                    apuracao.put(nome, votos);
                }
				list.add(new Candidato(nome,votos));
				line = br.readLine();
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo:" + e.getMessage());
		}
		for (String candidato : apuracao.keySet()) {
			System.out.println(candidato + ": " + apuracao.get(candidato));
		}
			
		
		sc.close();
	}

}
