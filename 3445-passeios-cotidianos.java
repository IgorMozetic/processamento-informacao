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
        
        int N = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        for(int i = 0; i < N; i++) {
            char casaTrabalho = sc.next().charAt(0);
            char trabalhoCasa = sc.next().charAt(0);
            
            char resposta1 = casaTrabalho;
            char resposta2 = trabalhoCasa;
            
            if(casaTrabalho == 'Y') {
                resposta1 = 'Y';
                H -= 1;
                W += 1;
            } else if(W==0) {
                resposta1 = 'Y';
                H -= 1;
                W += 1;
            } else {
                resposta1 = 'N';
            }
            
            if(trabalhoCasa == 'Y') {
                resposta2 = 'Y';
                W -= 1;
                H += 1;
            } else if(H==0) {
                resposta2 = 'Y';
                W -= 1;
                H += 1;
            } else {
                resposta2 = 'N';
            }
            
            System.out.printf("%c %c\n",resposta1,resposta2);
            
        }
    }
 
}