import java.io.IOException;

/**
* IMPORTANT:
* O nome da classe deve ser "Main" para que a sua solução execute
* Class name must be "Main" for your solution to execute
* El nombre de la clase debe ser "Main" para que su solución ejecutar
*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
        
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) {
            int N = sc.nextInt();
            int Q = sc.nextInt();
            
            int notas[] = new int[N];
            
            for(int i = 0; i < N; i++) {
                notas[i] = sc.nextInt();
            }
            
            Arrays.sort(notas);
            
        
            for(int i = 0; i < Q; i++) {
                int posicao = sc.nextInt();
                System.out.printf("%d\n", notas[(N - posicao)]);
            }
        }
    }

}