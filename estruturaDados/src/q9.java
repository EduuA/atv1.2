import java.lang.*;
import java.util.*;

public class q9 {
    public static void main(String[] args) {
        String[] array = { "maddu", "uva", "escalada", "987", "suave", "edu", "viagem", "marie", "surto", "mimir" };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor para pesquisa:");
        String searchTerm = scanner.nextLine().trim();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(searchTerm)) {
                System.out.println("Termo encontrado na posição: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Termo não encontrado");
        }
    }
}
