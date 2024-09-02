import java.lang.*;
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase(); 

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i); 
            for (int j = 0; j < alfabeto.length; j++) {
                if (letra == alfabeto[j]) {
                    System.out.print(j + " "); 
                    break; 
                }
            }
        }
    }
}