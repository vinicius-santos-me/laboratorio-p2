package aula;
import java.util.Scanner;

public class Semana {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] semana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
		int dia = sc.nextInt();
		sc.close();
		System.out.println(semana[dia]);
	
	}
}
