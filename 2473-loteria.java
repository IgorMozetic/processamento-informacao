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
        
        int escolhidos[] = new int[6];
        int sortidos[] = new int[6];
        int cont = 0;
        
        for(int i = 0; i < 6; i++) {
            escolhidos[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 6; i++) {
            sortidos[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(escolhidos[i] == sortidos[j]) {
                    cont++;
                    break;
                }
            }
        }
        
        if(cont == 3) {
            System.out.printf("terno\n");
        } else if(cont == 4) {
            System.out.printf("quadra\n");
        } else if(cont == 5) {
            System.out.printf("quina\n");
        } else if(cont == 6) {
            System.out.printf("sena\n");
        } else {
            System.out.printf("azar\n");
        }
 
    }
 
}