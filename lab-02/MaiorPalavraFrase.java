package aula;
import java.util.*;

public class MaiorPalavraFrase {
	public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	MaiorPalavraFrase maiorp = new MaiorPalavraFrase();
	
	
	while(true) {
		String[] frase = sc.nextLine().split(" ");
		if(frase.length == 1) {
			break;
		}else{
			String achou = maiorp.MaiorPalavra(frase);
			System.out.println(achou);
		}
	}
	sc.close();
}
	
	public String MaiorPalavra(String[] frase){
		String maior = "";
		for(String p : frase){
			if(p.length() > maior.length()) {
				maior = p;
				}
			}
		return maior;
	}
}
