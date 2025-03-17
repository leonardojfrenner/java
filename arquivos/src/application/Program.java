package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        String path = "C:\\TempPatchCD\\in.txt";
        String out = "C:\\TempPatchCD\\out.txt";

        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(", ");
                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);

                products.add(new Product(nome,preco,quantidade));

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(out))) {
            for (Product product : products) {
                double valorTotal = product.getPreco() * product.getQuantidade();
                writer.write(product.toString() + ", " + valorTotal);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
