package aula;
import java.util.*;

public class NotasDisciplinas {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		NotasDisciplinas funcoes = new NotasDisciplinas();
		int n = sc.nextInt();
		int[] numeros = new int[n];
		int soma = 0;
		
		
		for(int i = 0; i < n; i++) {
			int numero = sc.nextInt();
			numeros[i] = numero;
			soma += numero;
		}
		if(n > 0) {
		System.out.println("Media: " + soma/n);
		System.out.println("NOTA MAXIMA: " + funcoes.MaiorNdaLista(numeros));
		System.out.println("NOTA MINIMA: " + funcoes.MenorNdaLista(numeros));
		sc.close();
	}
}
	
	public int MaiorNdaLista(int[] lista) {
		int maior = lista[0];
		
		for(int num : lista) {
			if(maior < num) {
				maior = num;
			}
		}
		return maior;
	}
	
	public int MenorNdaLista(int[] lista) {
		int menor = lista[0];
		
		for(int num : lista) {
			if(menor > num) {
				menor = num;
			}
		}
		return menor;
	}
	
}