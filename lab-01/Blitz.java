/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;

public class Blitz{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String Apreendido = "False";
        int licenciamento = sc.nextInt();
        int carteira = sc.nextInt();
        double bafometro = sc.nextDouble();

        if(licenciamento >= 30 || carteira >= 30 || bafometro > 0.05){
            Apreendido = "True";
        }
        System.out.println(Apreendido);
    }
}
