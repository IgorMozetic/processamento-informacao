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
        
        double salario = sc.nextDouble();
        double salarioNovo, reajuste;
        String str = "%";
        
        if(salario>=0 && salario<=400.00) {
            reajuste = 1.15;
            salarioNovo = salario * reajuste;
        } else if(salario>400 && salario<=800.00) {
            reajuste = 1.12;
            salarioNovo = salario * reajuste;
        } else if(salario>800 && salario<=1200.00) {
            reajuste = 1.1;
            salarioNovo = salario * reajuste;
        } else if(salario>1200 && salario<=2000.00) {
            reajuste = 1.07;
            salarioNovo = salario * reajuste;
        } else {
            reajuste = 1.04;
            salarioNovo = salario * reajuste;
        }
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %.0f %s\n",salarioNovo,salarioNovo-salario,((reajuste-1)*100),str);
    }
 
}