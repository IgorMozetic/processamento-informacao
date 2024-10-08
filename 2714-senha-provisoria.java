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
        
        int N = sc.nextInt();
        boolean validacao;
        
        for(int i = 0; i < N; i++) {
            
            String ra = sc.next();
            String identificador="";
            int digito=0;
            
            if(ra.substring(0,2).equals("RA") && ra.length() == 20) {
                for(int j = 2; j < ra.length(); j++) {
                    if(ra.charAt(j) != '0') {
                        digito = j;
                        break;
                    }
                }
                identificador = ra.substring(digito,20);
                validacao = true;
            } else {
                validacao = false;
            }
            if(validacao) {
                System.out.printf("%s\n",identificador);    
            } else {
                System.out.printf("INVALID DATA\n");
            }
            
        }
 
    }
 
}