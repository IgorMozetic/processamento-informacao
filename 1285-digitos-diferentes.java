import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
import java.util.Scanner;

public class Main {
    
    static int[] digitos(int x) {
        int numero = x;
        
        int a[] = {-1,-2,-3,-4};
        
        for(int i = 1; i <= a.length;i++) {
            a[a.length-i] = numero % 10;
            numero = numero / 10;
            
            if(numero <= 0) {
                break;
            }
        }
        return a;
    }
    
    static boolean digitoUnico(int[] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(a[i] == a[j] && i!=j) {
                    return false;
                }
            }
        }
        return true;
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int cont = 0;
            
            for(int i = N; i <= M; i++) {
                int[] dig = digitos(i);
                
                if(digitoUnico(dig)) {
                    cont++;
                }
            }
            
        System.out.printf("%d\n",cont);
        }
 
    }
 
}