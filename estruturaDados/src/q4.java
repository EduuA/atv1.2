import java.lang.*;
import java.util.*;

public class q4 {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        int soma = 0;
        int subtracao = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira 7 números inteiros:");
        for (int i = 0; i < 7; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            if (i == 0) {
                subtracao = numeros[i];
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next(); 
            }
        }
        System.out.println("A soma de todos os números é: " + soma);
        System.out.println("A subtração de todos os números é: " + subtracao);
    }
}
