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
        int L = sc.nextInt();
        int D = sc.nextInt();
        
        double resultado = Math.ceil((N * D)/(L * 1000.0)) * L;
        
        System.out.printf("%.0f\n",resultado);
 
    }
 
}