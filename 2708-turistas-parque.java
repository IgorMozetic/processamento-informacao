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
        
        int turistas = 0;
        int jipes = 0;
        boolean validacao = true;
        
        while(validacao) {
            String entrada = sc.next();
            if(entrada.equals("ABEND")) {
                validacao = false;
                break;
            } else if(entrada.equals("SALIDA")) {
                turistas += sc.nextInt();
                jipes++;
            } else {
                turistas -= sc.nextInt();
                jipes--;
            }
        }
        System.out.printf("%d\n",turistas);
        System.out.printf("%d\n",jipes);
    }
 
}