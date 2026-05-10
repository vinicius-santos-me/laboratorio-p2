package aula;
import java.util.*;

public class TrocaPalavra{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String palavra = sc.nextLine();
		String[] frase = sc.nextLine().split(" ");
		sc.close();
		
		for(int i = 0; i < frase.length;i++) {
			if(frase[i].equals(palavra)) {
				frase[i] = "***";
			}
		}
		
		for(String p: frase) {
			System.out.print(p + " ");
		}
		System.out.println();
	}
}