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
        
        int tempoExpediente = sc.nextInt();
        int tempoPresente1 = sc.nextInt();
        int tempoPresente2 = sc.nextInt();
        
        if( tempoExpediente >= (tempoPresente1+tempoPresente2) ) {
            System.out.printf("Farei hoje!\n");
        } else {
            System.out.printf("Deixa para amanha!\n");
        }
    }
 
}