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
        int minutos=0;
        String tempoJogo="";
        
        for(int i = 0; i < N; i++) {
            String entrada = sc.next();
            String tempo = sc.next();
            
            if(tempo.equals("1T")) {
                minutos = Integer.parseInt(entrada);
                if(minutos > 45) {
                    minutos -= 45;
                    tempoJogo = "45+" + String.valueOf(minutos);
                } else {
                    tempoJogo = String.valueOf(minutos);
                }
            } else {
                minutos = Integer.parseInt(entrada) + 45;
                if( minutos > 90 ) {
                    minutos -= 90;
                    tempoJogo = "90+" + String.valueOf(minutos);
                } else {
                    tempoJogo = String.valueOf(minutos);
                }
            }
            
            System.out.printf("%s\n",tempoJogo);
        }
    }
 
}