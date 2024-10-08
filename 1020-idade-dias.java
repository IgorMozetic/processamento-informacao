import java.io.IOException;
 
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        
        int anos = entrada/365;
        entrada = entrada-(anos*365);
        int meses =  entrada/30;
        entrada = entrada-(meses*30);
        int dias = entrada;
        
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)", anos, meses, dias);
        System.out.println();
 
    }
 
}