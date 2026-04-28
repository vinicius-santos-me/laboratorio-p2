/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;


public class LendoDados{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();
        System.out.println(nome + " - " + idade);
    }
}
