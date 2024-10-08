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
        
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            boolean condicao = true;
            if(N==0) {
                break;
            }
            
            
            int contadorTentativas = 0;
            while(condicao) {
                int cont = 0;
                for(int i = 1; i <= N; i++) {
                    int numero = sc.nextInt();
                    if(numero == i) {
                        cont++;
                    }
                }
                contadorTentativas++;
                if(cont == N) {
                    condicao = false;
                }
            }
            System.out.printf("%d\n",contadorTentativas);
        }
 
    }
 
}