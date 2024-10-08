import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
import java.util.Scanner;

public class Main {
 
    static int menor(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        
        int maquinaA1 = (2*a2) + (4*a3);
        int maquinaA2 = (2*a1) + (2*a3);
        int maquinaA3 = (4*a1) + (2*a2);
        
        System.out.printf("%d\n",menor( maquinaA3, menor( maquinaA1, maquinaA2 )));
 
    }
 
}