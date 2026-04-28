/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;

public class AlturaAviao{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int alturaIdeal = sc.nextInt();
        int medicaoAltura = sc.nextInt();

        int Aproximacao = Math.abs(alturaIdeal - medicaoAltura);


        while(true){
            int medicao = sc.nextInt();
            int diferenca = Math.abs(alturaIdeal-medicao);
            if (medicao == alturaIdeal){
                System.out.println("OK");
                break;
            }else if(diferenca < Aproximacao){
                System.out.println("ADEQUADO");
                Aproximacao = diferenca;

            }else{
                System.out.println("PERIGO");
                Aproximacao = diferenca;
                }
            }
        }
    }
