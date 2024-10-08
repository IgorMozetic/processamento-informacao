import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int sortidos[] = new int[N];
        int cont = 1;
        int result = 0;
        
        for(int i = 0; i < N; i++) {
            sortidos[i] = sc.nextInt();
            if(i>0) {
                int valorAntigo = sortidos[i-1];
                if(sortidos[i] == valorAntigo) {
                    cont++;
                } else {
                    result = Math.max(cont,result);
                    cont=1;
                }
            }
        }
        result = Math.max(cont,result);
        System.out.printf("%d\n",result);
 
    }
 
}