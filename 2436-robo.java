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
       
        int L = sc.nextInt();
        int C = sc.nextInt();
       
        int A = sc.nextInt() - 1;
        int B = sc.nextInt() - 1;
       
        int prevA = -1;
        int prevB = -1;
       
        int matriz[][] = new int[L][C];
       
        for(int i = 0; i < L; i++) {
            for(int j = 0; j < C; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        while(true) {
            if((A+1!=L) && matriz[A+1][B] == 1 && (A+1!=prevA) ) {
                prevA = A;
                prevB = B;
                A += 1;
            } else if((A-1!=-1) && matriz[A-1][B] == 1 && (A-1!=prevA) ) {
                prevA = A;
                prevB = B;
                A -= 1;
            } else if((B+1!=C) && matriz[A][B+1] == 1 && (B+1!=prevB) ) {
                prevB = B;
                prevA = A;
                B += 1;
            } else if((B-1!=-1) && matriz[A][B-1] == 1 && (B-1!=prevB) ) {
                prevB = B;
                prevA = A;
                B -= 1;
            } else {
                break;
            }
        }
        System.out.printf("%d %d\n",A+1,B+1);
    }
 
}