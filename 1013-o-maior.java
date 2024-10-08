import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
import java.math.*;
import java.util.Scanner;

public class Main {
    
    static int maior(int a, int b) {
        
        return ((a+b+Math.abs(a-b))/2);
    }
 
    public static void main(String[] args) throws IOException {
 
        // Declarando sc como scanner
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
 
        int maior1 = maior(num1,num2);
        int result = maior(maior1,num3);
        
        System.out.printf("%d eh o maior\n", result);
    }
 
}