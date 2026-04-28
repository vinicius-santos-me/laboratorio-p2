/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;

public class Wally{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    while(true){
        String atual = "?";
        String entrada = sc.nextLine();
        if(entrada.equals("wally")){
            break;
        }else{
        for(String nomes : entrada.split(" ")){
            int teste = nomes.length();
            if(teste == 5){
                atual = nomes;
            }
        }
         System.out.println(atual);
            }    
        }
    }
}
