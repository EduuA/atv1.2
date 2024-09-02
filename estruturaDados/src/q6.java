import java.lang.*;
import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        System.out.println("Insira 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    numeros[i] = scanner.nextInt();

                    if (numeros[i] > maior) {
                        segundoMaior = maior;
                        maior = numeros[i];
                    } else if (numeros[i] > segundoMaior) {
                        segundoMaior = numeros[i];
                    }
                   
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                }
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O segundo maior número é: " + segundoMaior);

    }
}