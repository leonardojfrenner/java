package application;

import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Application {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birthdate (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		sc.nextLine();
		Client client = new Client(name,email,birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(new Date(),OrderStatus.valueOf(status),client);
		
		System.out.print("How many items to this order? ");
		int quantity = sc.nextInt();
		sc.nextLine();
		for (int i = 0;i < quantity;i++) {
			System.out.println("Enter #"+(i+1)+" item data: " );
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantityProduct=sc.nextInt();
			sc.nextLine();
			
			Product product= new Product(nameProduct,productPrice);
			
			OrderItem item = new OrderItem(quantityProduct,productPrice,product);
			
			order.addItem(item);
			
			item.subTotal(quantityProduct, productPrice);
			
			
			
		}
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
