/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;

public class Sorvete{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int posicao_1 = sc.nextInt();
        int velocidade_1 = sc.nextInt();
        int posicao_2 = sc.nextInt();
        int velocidade_2 = sc.nextInt();
        int tempo = sc.nextInt();
        
        int dist1 = posicao_1 + (tempo * velocidade_1);
        int dist2 = posicao_2 + (tempo * velocidade_2);
        System.out.println(Math.abs(dist1 - dist2));
    }
}
