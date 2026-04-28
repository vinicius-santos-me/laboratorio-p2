/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;

public class Calculadora{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        String operacao = sc.nextLine();

        if(operacao.equals("+")){
            double valor_1 = sc.nextDouble();
            double valor_2 = sc.nextDouble();
            System.out.println("RESULTADO: " + (valor_1 + valor_2));
        }else if (operacao.equals("-")){
            double valor_1 = sc.nextDouble();
            double valor_2 = sc.nextDouble();
            System.out.println("RESULTADO: " + (valor_1 - valor_2));
        }else if (operacao.equals("*")){
            double valor_1 = sc.nextDouble();
            double valor_2 = sc.nextDouble();
            System.out.println("RESULTADO: " + (valor_1 * valor_2));
        }else if (operacao.equals("/")){
            double valor_1 = sc.nextDouble();
            double valor_2 = sc.nextDouble();
            if (valor_2 == 0){
                System.out.println("ERRO");
            }else{
                System.out.println("RESULTADO: " + (valor_1 / valor_2));
            }
        }else{
            System.out.println("ENTRADA INVALIDA");
        }
    }
}
