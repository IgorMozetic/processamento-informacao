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
        
        int C = sc.nextInt();
        char T = sc.next().charAt(0);
        double matriz[][] = new double[12][12];
        double resultado = 0.0;
        
        
        for(int i = 0; i<12; i++) {
            for(int j = 0; j<12; j++) {
                matriz[i][j] = sc.nextDouble();
                
                if(j == C) {
                    resultado += matriz[i][j];
                }
            }
        }
        
        if(T == 'S') {
            System.out.printf("%.1f\n",resultado);
        } else {
            resultado = resultado/12;
            System.out.printf("%.1f\n",resultado);
        }
    }
}