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
        
        int valores[] = new int[4];
        
        for(int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }
        
        int valor1 = valores[0] * valores[1];
        int valor2 = valores[2] * valores[3];
 
        if (valor1==valor2) {
            System.out.printf("0\n");
        } else if (valor1>valor2) {
            System.out.printf("-1\n");
        } else {
            System.out.printf("1\n");
        }
    }
 
}