/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;

public class Advinhar{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int numeroAchar = sc.nextInt();

        while(true){
            int num = sc.nextInt();
            if(num > numeroAchar){
                System.out.println("MAIOR");
            }else if(num < numeroAchar){
                System.out.println("MENOR");

            }else if(num == numeroAchar){
                System.out.println("ACERTOU");
                break;
            }
        }
    }
}
