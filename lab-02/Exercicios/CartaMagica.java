package aula;
import java.util.*;

public class CartaMagica {
	public static void main (String args[]) {
		Random random = new Random();
		
		String[] naipes = {"Paus", "Ouros", "Copas", "Espadas"};
		String[] cartas = {"1", "2", "3", "4", "5", "6" , "7", "8", "9", "Valete", "Dama", "Rei"};
		int i = random.nextInt(naipes.length);
		int j = random.nextInt(cartas.length);
		System.out.print(cartas[j]+ " de " + naipes[i]);	
	}
}