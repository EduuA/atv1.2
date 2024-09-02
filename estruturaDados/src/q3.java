import java.lang.*;
import java.util.*;

public class q3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int soma = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        System.out.println("A soma de todos os números é: " + soma);

    }
}