/**
 * Laboratório de Programação 2 - Lab 1
 * * @author Vinicius Santos Sousa - 20250030551
 */
import java.util.Scanner;

public class PagamentoCartao{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        String cartao = sc.next();

        if(cartao.equals("credito")){
            String parcelar = sc.next();
            if(parcelar.equals("s")){
               int parcelas = sc.nextInt();
               double total = x/parcelas;
               System.out.println(parcelas + " PARCELAS DE " + total +" REAIS");
            }else if(parcelar.equals("n")){
                System.out.println(x + " REAIS NO CREDITO (DIRETO)");
            }
        }else{
            System.out.println(x + " REAIS NO DEBITO");
        }
    }
}
