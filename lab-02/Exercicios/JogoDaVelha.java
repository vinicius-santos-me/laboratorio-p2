package aula;
import java.util.*;

public class JogoDaVelha {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma das três opções:\n1. PEDRA\n2. PAPEL\n3. TESOURA");
		System.out.println("Digite sua opção Jogador 1: ");
		int jogador_1 = sc.nextInt();
		System.out.println("Digite sua opção Jogador 2: ");
		int jogador_2 = sc.nextInt();
		String resultado = "";
		
		if(jogador_1 == jogador_2){
			resultado = "EMPATE";
		}else if(jogador_1 == 1) {
			if(jogador_2 == 2) {
				resultado = "JOGADOR 2";
			}else{
				resultado = "JOGADOR 1";
			}
		}else if(jogador_1 == 2) {
			if(jogador_2 == 1){
				resultado = "JOGADOR 1";
			}else {
				resultado = "JOGADOR 2";
			}
		}else if(jogador_1 == 3) {
			if(jogador_2 == 2) {
				resultado = "JOGADOR 1";
			}else{
				resultado = "JOGADOR 2";
			}
		}else {
			resultado = "ENTRADA INVÁLIDA";
		}
		System.out.println(resultado);
		sc.close();
	}
}
