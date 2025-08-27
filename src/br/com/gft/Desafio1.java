package br.com.gft;
import java.util.Scanner;

public class Desafio1{
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");

        int numero = scanner.nextInt();

        // Loop principal que continua enquanto o número tiver mais de um dígito
        while (numero >= 10) {
            int soma = 0;

             //Loop para somar os dígitos do número real
            while (numero > 0) {
                soma += numero % 10; // Adiciona o último dígito a soma
                numero /= 10;  // Remove o último dígito do número
          }
        numero = soma; // Atualiza o número com a soma para a próxima iteração
      }

      System.out.println("A soma dos dígitos é: " + numero);
      
      scanner.close();

    }
}
