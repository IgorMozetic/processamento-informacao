import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
import java.util.Scanner;

public class Main {
    static double media(double a, double b) {
        return ((a*3.5)+(b*7.5))/11;
    }
    public static void main(String[] args) throws IOException {
        
        // Declarando sc como scanner
        Scanner sc = new Scanner(System.in);
        
        // Declarando as variáveis das notas e recebendo os valores
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        
        // Imprimindo a média
        System.out.printf("MEDIA = %.5f\n", media(nota1,nota2));
        
    }
 
}