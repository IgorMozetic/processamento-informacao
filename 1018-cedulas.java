import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
import java.util.Scanner;

public class Main {
    static int cedulas(int n, int valor) {
        int notas = n/valor;
        System.out.printf("%d nota(s) de R$ %d,00\n",notas,valor);
        return n%valor;
    }
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int valor1 = sc.nextInt();
        System.out.printf("%d\n",valor1);
        int resto = cedulas(valor1,100);
        resto = cedulas(resto,50);
        resto = cedulas(resto,20);
        resto = cedulas(resto,10);
        resto = cedulas(resto,5);
        resto = cedulas(resto,2);
        resto = cedulas(resto,1);
        
    }
 
}