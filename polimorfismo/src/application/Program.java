package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		Scanner sc = new Scanner(System.in);
		
		int n;
		char x;
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Product #" +(i+1)+ " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			x = sc.next().charAt(0);
			sc.nextLine();
			
			if(x == 'c' || x == 'C') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				list.add(new Product(name,price));
			}
			if(x == 'i' || x == 'I') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name,price,customsFee));
			}
			if(x == 'u' || x == 'U') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("Manufacture date: ");
				String date = sc.nextLine();
				Date manufactureDate = sdf.parse(date);

				list.add(new UsedProduct(name,price,manufactureDate));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product product : list) {
			System.out.println(product);
		}
		sc.close();
	}

}
