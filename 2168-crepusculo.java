import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[][] matrix = new int[N+1][N+1];
        
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < N + 1; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int qtdCam = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                
                if (qtdCam > 1) {
                    System.out.printf("S");
                } else {
                    System.out.printf("U");
                }
            }
            
            System.out.printf("\n");
        }
 
    }
// PJL Kayky e Marcos
}