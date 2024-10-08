import java.io.IOException;
 

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        double combustivel = sc.nextDouble();
        double media = distancia/combustivel;
        
        System.out.printf("%.3f km/l", media);
        System.out.println();
 
    }
 
}