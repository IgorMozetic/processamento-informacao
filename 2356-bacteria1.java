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
        
        while(sc.hasNext()) {
            String DNA = sc.next();
            String codigo = sc.next();
            
            if( DNA.contains(codigo) ) {
                System.out.printf("Resistente\n");
            } else {
                System.out.printf("Nao resistente\n");
            }
        }
        
    }
 
}