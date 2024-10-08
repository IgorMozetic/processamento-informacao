import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
import java.util.Scanner;
import java.util.Arrays;
public class Main {
 
    
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int boasAcoes[] = new int[N];
        int qntPresenteAtual = 1;
        int presentes = 0;
        
        for(int i = 0; i<N; i++) {
            boasAcoes[i] = sc.nextInt();
        }
        
        Arrays.sort(boasAcoes);
        
        for(int i = 1; i<N; i++) {
            if(boasAcoes[i]==boasAcoes[i-1]) {
                presentes += qntPresenteAtual;
                
            } else {
                presentes+=qntPresenteAtual;
                qntPresenteAtual++;
            }
        }
        
        presentes+=qntPresenteAtual;
        
        System.out.println(presentes);
        
 
    }
 
}