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
        
        int N, M2=0, M3=0, M4=0, M5=0;
        N = sc.nextInt();
        
        for(int i = 0; i < N; i++) {
            int L = sc.nextInt();
            if(L%2==0) {
                M2++;
            }
            if(L%3==0) {
                M3++;
            }
            if(L%4==0) {
                M4++;
            }
            if(L%5==0) {
                M5++;
            }
        }
        
        System.out.printf("%d Multiplo(s) de 2\n%d Multiplo(s) de 3\n%d Multiplo(s) de 4\n%d Multiplo(s) de 5\n",M2,M3,M4,M5);
    }
}