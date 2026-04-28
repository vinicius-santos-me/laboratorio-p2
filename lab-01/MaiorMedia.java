/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;

public class MaiorMedia{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] lista = entrada.split(" ");
        int[] numeros = new int[lista.length];
        int soma = 0;
        for (int i = 0; i < lista.length;i++){
            soma += Integer.parseInt(lista[i]);
            numeros[i] = Integer.parseInt(lista[i]);
        }
        int media = soma/lista.length;
        for(int numero : numeros){
            if(numero > media){
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}
