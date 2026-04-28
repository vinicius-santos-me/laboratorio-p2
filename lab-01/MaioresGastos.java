/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;

public class MaioresGastos{
    public static void main(String args[]){
        int maior_1 = 0,maior_2 = 0, posicao = 0;

        Scanner sc = new Scanner(System.in);
        String[] valores = sc.nextLine().split(" ");

        for(int i = 0; i < valores.length; i++){
            if(maior_1 < Integer.parseInt(valores[i])){
                maior_1 = Integer.parseInt(valores[i]);
                posicao = i;
            }
        }
        for(int x = 0; x < valores.length; x++){
            if(maior_2 < Integer.parseInt(valores[x]) && x != posicao){
                maior_2 = Integer.parseInt(valores[x]);
            }
        }

        System.out.println(maior_1+maior_2);
        
    }
}
