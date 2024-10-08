import java.io.IOException;
 
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        double entrada = sc.nextFloat();
        
        double elevado = Math.pow(entrada, 3);
        double resultado = ((4.0/3) * 3.14159 * elevado);
 
        System.out.printf("VOLUME = %.3f", resultado);
        System.out.println();
    }
 
}