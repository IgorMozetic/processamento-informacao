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
        String palavra = sc.next();
        int cont=0;
        
        for(int i = 0; i<N; i++) {
            if(palavra.charAt(i) == 'a') {
                if(i==0) {
                    if(palavra.charAt(i) == palavra.charAt(i+1)) {
                        cont++;
                    }
                } else if(i+1 == N) {
                    if(palavra.charAt(i) == palavra.charAt(i-1)) {
                        cont++;
                    }
                } else {
                    if(palavra.charAt(i) == palavra.charAt(i-1) || palavra.charAt(i) == palavra.charAt(i+1)) {
                        cont++;
                    }
                } 
            }
        }
        
        System.out.printf("%d\n",cont);
        
 
    }
 
}