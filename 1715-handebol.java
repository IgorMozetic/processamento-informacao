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
        
        int n, m, gol, cont = 0, qntPartidas = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                gol = sc.nextInt();
                if(gol>=1) {
                    cont++;
                }
            }
            if(cont == m) {
                qntPartidas++;
            }
            cont=0;
        }
        System.out.printf("%d\n",qntPartidas);
 
    }
 
}