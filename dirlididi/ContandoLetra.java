package dirlididi;
import java.util.*;

public class ContandoLetra {

	public static void main(String[] args) {
		ContandoLetra funcoes = new ContandoLetra();
		Scanner sc = new Scanner(System.in);
		String caractereBuscar = sc.nextLine();
		String[] frase = sc.nextLine().split(" ");
		int totalDaLetra = 0;
		for(String palavra : frase) {
			totalDaLetra += funcoes.ContadorLetrar(palavra, caractereBuscar);
		}
		System.out.println(totalDaLetra);
		sc.close();
	}
	public int ContadorLetrar(String palavra, String letra) {
		int total = 0;
		for (String letraPalavra : palavra.split("")){
			if (letraPalavra.equals(letra)) {
				total++;
			}
		}
		return total;
	}
}
