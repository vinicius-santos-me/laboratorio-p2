package dirlididi;
import java.util.*;

public class PalavrasIngratas {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		PalavrasIngratas funcoes = new PalavrasIngratas();
		int contador = 0;
		while(contador != 3){
		boolean ingrata = true;
		String palavra = sc.nextLine();
		for(String letra : palavra.split("")) {
			if(funcoes.MeuIn(letra, "aeiouAEIOU")){
				ingrata = false;
				break;
			}
		}
		if(ingrata) {
			System.out.println(palavra);
			contador++;
			}
		}
		sc.close();
	}


	public boolean MeuIn(String letra, String vogais){
		String[] vogaisList = vogais.split("");
		for(int i = 0; i < vogaisList.length; i++) {
			if(vogaisList[i].equals(letra)){
				return true;
			}
		}
		return false;
	}
	
}

