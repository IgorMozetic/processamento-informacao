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
        
        while(sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int soma = 0;
            
            int valores[] = new int[N];
            
            for(int i = 0; i < N; i++) {
                valores[i] = sc.nextInt();
            }
            
            for(int i = 1; i <= M; i++) {
                soma += valores[N-i];
            }
            
            System.out.printf("%d\n",soma);
        }
 
    }
 
}