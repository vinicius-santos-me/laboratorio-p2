/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;

public class GastoMensal{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");
        String[] valores = sc.nextLine().split(" ");
        String consultar = sc.nextLine();
        int i = 0; 
        while(true){
            if(entrada[i].equals(consultar)){
                break;
            }else{
                i++;
            }
        }
        System.out.println(valores[i]);
    }
}
