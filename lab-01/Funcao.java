/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;

public class Funcao{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String tipo;
        int valor = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        int valor4 = sc.nextInt();

        if(valor != valor2 && valor != valor3 && valor != valor4 && valor2 != valor3 && valor2 != valor4 && valor3 != valor4){
            if(valor < valor2 && valor2 < valor3 && valor3 < valor4){
                tipo = "POSSIVELMENTE ESTRITAMENTE CRESCENTE";
            }else if(valor > valor2 && valor2 > valor3 && valor3 > valor4){
                tipo = "POSSIVELMENTE ESTRITAMENTE DECRESCENTE";
            }else{
                tipo =  "FUNCAO NAO ESTRITAMENTE CRES/DECR";
            }
        }else{
            tipo = "FUNCAO NAO ESTRITAMENTE CRES/DECR";
        }
        System.out.println(tipo);
    }
}
