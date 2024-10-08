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
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if( a-b==0 || a-c==0 || b-c==0 || a+b-c==0 || a+c-b==0 || c+b-a==0 ) {
            System.out.printf("S\n");
        } else {
            System.out.printf("N\n");
        }
    }
}