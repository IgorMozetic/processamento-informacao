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
        
        int p = sc.nextInt();
        int j1 = sc.nextInt();
        int j2 = sc.nextInt();
        int r = sc.nextInt();
        int a = sc.nextInt();
        
        if(r==1){
            if(a==0) {
                System.out.printf("Jogador 1 ganha!\n");
            } else {
                System.out.printf("Jogador 2 ganha!\n");
            }
        } else if(a==1){
            System.out.printf("Jogador 1 ganha!\n");
        } else if(((j1+j2)%2) == p) {
            System.out.printf("Jogador 2 ganha!\n");
        } else {
            System.out.printf("Jogador 1 ganha!\n");
        }
    }
 
}