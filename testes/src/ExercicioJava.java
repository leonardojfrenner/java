import java.util.ArrayList;
import java.util.Scanner;

//alterei aqui pq era a classe que ja estava aberta, depois é só voltar para ListaNumeros se seu arquivo esta nomeado assim
public class ExercicioJava {

    public static void main(String[] args) {
        // Criando uma lista para armazenar os números
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;
        
        // Recebendo números do usuário
        System.out.println("Digite números inteiros (ou qualquer outro caractere para parar): ");
        while (scanner.hasNextInt()) {
            numero = scanner.nextInt();
            numeros.add(numero);  // Adiciona o número à lista
        }
        
          // Exibindo os números armazenados
        System.out.println("Números armazenados: ");
        
        //para printar na tela a lisa
         for (int num : numeros) {
            System.out.print(" "+ num);
        }
        
      
        // Calculando a soma dos números
        for (int num : numeros) {
            soma += num;
        }
        System.out.println();
        // Exibindo a soma total
        System.out.println("Soma total dos números: " + soma);
        
        scanner.close();
    }
}