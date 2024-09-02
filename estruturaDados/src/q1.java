import java.lang.*;

public class q1 {
    public static void main(String[] args) {
        
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
       
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        
        
        for (int i = 0; i < alfabeto.length; i++) {
           
            boolean isVogal = false;
            
        
            for (int j = 0; j < vogais.length; j++) {
               
                if (alfabeto[i] == vogais[j]) {
                    
                    isVogal = true;
                   
                    break;
                }
            }
            
           
            if (!isVogal) {
                System.out.print(alfabeto[i] + " ");
            }
        }
    }
}
