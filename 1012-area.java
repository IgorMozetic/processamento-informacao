import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
import java.util.Scanner;
import java.math.*;

public class Main {
    static void trinagulo(double val1, double val2){
        double resultado = (val1*val2)/2;
        System.out.printf("TRIANGULO: %.3f\n", resultado);
    }
    
    static void circulo(double val1){
        double resultado = Math.pow(val1,2)*3.14159;
        System.out.printf("CIRCULO: %.3f\n", resultado);
    }
    
    static void trapezio(double val1, double val2, double val3){
        double resultado = ((val1+val2)*val3)/2;
        System.out.printf("TRAPEZIO: %.3f\n", resultado);
    }
    
    static void quadrado(double val1){
        double resultado = Math.pow(val1,2);
        System.out.printf("QUADRADO: %.3f\n", resultado);
    }
    
    static void retangulo(double val1, double val2){
        double resultado = val1*val2;
        System.out.printf("RETANGULO: %.3f\n", resultado);
    }
    
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        trinagulo(A,C);
        circulo(C);
        trapezio(A,B,C);
        quadrado(B);
        retangulo(A,B);
 
    }
 
}