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
        
        String entrada = sc.nextLine();
        
        if( (entrada.toLowerCase().equals("quantidade")) || (entrada.toLowerCase().equals("intensidade")) ) {
            System.out.printf("mais\n");
        } else {
            System.out.printf("mas\n");
        }
 
    }
 
}