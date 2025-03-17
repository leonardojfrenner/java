package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.println("Tax payer #"+(i+1) +" data:");
			System.out.print("Individual or company(i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			if(ch =='i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				sc.nextLine();
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name,anualIncome,healthExpenditures));
			}
			if(ch =='c') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				sc.nextLine();
				System.out.print("Number of employees: ");
				int numberOfEmplyees = sc.nextInt();
				list.add(new Company(name,anualIncome,numberOfEmplyees));
			}
			
		}

		System.out.println();
		double totalTaxes= 0.0;
		System.out.println("TAXES PAID: ");
		for (TaxPayer payers : list) {
			totalTaxes += payers.tax();
			System.out.println(payers);
		}
		System.out.println();
		System.out.printf("TOTAL TAXES %.2f", totalTaxes );
		
		sc.close();
	}

}
