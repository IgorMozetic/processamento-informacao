import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
import java.util.Scanner;


public class Main {
    static boolean primo(int a) {
        int lim = (a/2);
        if(!(a % 2 == 0 && (a == 2 || a == 1))) {
            for(int i=3; i<=lim ; i++){
                if(a % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
       
       int peso, h, d, v=0, cont=0;
       
       peso = sc.nextInt();
       
       while( cont<10 ) {
           if(!(primo(peso))){
               peso++;
           } else {
               v += peso;
               peso++;
               cont++;
           }
       }
       
       h = (60000000/v);
       d = h/24;
       
       System.out.printf("%d km/h\n%d h / %d d\n",v,h,d);
       
    }
 
}