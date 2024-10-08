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
        
        // Declarando sc como scanner
        Scanner sc = new Scanner(System.in);
        
        // Declarando as variáveis das notas e recebendo os valores
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        
        // Declaração da variável média e seu calculo
        double media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
        
        // Imprimindo a média
        System.out.printf("MEDIA = %.1f", media);
        System.out.println();
    }
}