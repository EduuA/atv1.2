import java.lang.*;
import java.util.*;

public class q5 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível de um inteiro
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i]; 
            }
        }
        
        System.out.println("O maior número é: " + maior);
        
        scanner.close();
    }
}