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
        
        int N, C, S, E, Q=0;
        
        N = sc.nextInt();
        C = sc.nextInt();
        
        for(int i = 0; i < N; i++) {
            S = sc.nextInt();
            E = sc.nextInt();
            Q = (Q-S)+E;
            if(Q > C) {
                System.out.printf("S\n");
                break;
            }
        }
        if(!(Q>C)){
            System.out.printf("N\n");
        }
    }
 
}