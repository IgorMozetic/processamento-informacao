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
        
        int volumeInicial = sc.nextInt();
        int numTrocas = sc.nextInt();
        
        int trocas[] = new int[numTrocas];
        
        for(int i = 0; i < numTrocas; i++) {
            trocas[i] = sc.nextInt();
            volumeInicial += trocas[i];
            if(volumeInicial > 100) {
                volumeInicial = 100;
            } else if(volumeInicial < 0) {
                volumeInicial = 0;
            }
        }
        
        System.out.printf("%d\n",volumeInicial);
 
    }
 
}