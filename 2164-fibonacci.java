import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

import java.util.Scanner;

public class Main {
    static double fibonacci(int valor) {
        double pt1 = Math.pow((1 + Math.sqrt(5) )/2, valor);
        double pt2 = Math.pow((1 - Math.sqrt(5) )/2, valor);
        return Math.floor( (pt1-pt2) / Math.sqrt(5) );
    }
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int valor = sc.nextInt();
        
        System.out.printf("%.1f\n", fibonacci(valor));
 
    }
 
}