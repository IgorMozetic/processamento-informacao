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
        
        int distancia = sc.nextInt();
        
        if(distancia <= 800) {
            System.out.printf("%d\n",1);
        } else if(distancia <= 1400) {
            System.out.printf("%d\n",2);
        } else {
            System.out.printf("%d\n",3);
        }
    }
 
}