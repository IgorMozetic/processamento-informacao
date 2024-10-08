import java.io.IOException;

/**
* IMPORTANT:
* O nome da classe deve ser "Main" para que a sua solução execute
* Class name must be "Main" for your solution to execute
* El nombre de la clase debe ser "Main" para que su solución ejecutar
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        
        int QS = sc.nextInt();
        int Q2D = sc.nextInt();
        int verificacao = 0;
        
        int ident2D[] = new int[Q2D];
        int identS[] = new int[QS];
        
        for(int i = 0; i < Q2D; i++) {
            ident2D[i] = sc.nextInt();
        }
        
        for(int i = 0; i < QS; i++) {
            identS[i] = sc.nextInt();
        }
        
        for(int i = 0; i < QS; i++) {
            for(int j = 0; j < Q2D; j++) {
                if(ident2D[j] == identS[i]) {
                    verificacao = 0;
                    break;
                } else {
                    verificacao = 1;
                    for(int k = 0; k < i; k++) {
                        if(identS[k] == identS[i]) {
                            verificacao = 0;
                            break;
                        }
                    }
                }
            }
        System.out.printf("%d\n",verificacao);
        verificacao = 1;
        }
    }
}