import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int V, I, J, K, L, resto, cont=0;
        
        while(true) {
            V = sc.nextInt();
            if((V==0)) {
               break; 
            }
            cont +=1;
                I = V/50;
                resto = V%50;
                J = resto/10;
                resto = resto%10;
                K = resto/5;
                resto = resto%5;
                L = resto;
                System.out.printf("Teste %d\n%d %d %d %d\n\n",cont,I,J,K,L);
            
        }
 
    }
 
}