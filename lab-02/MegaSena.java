package aula;
import java.util.*;

public class MegaSena {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		MegaSena funcoes = new MegaSena();
		int jogadores = sc.nextInt();
		int total_bilhetes = jogadores * 10;
		
		for(int x = 0; x < total_bilhetes; x++) {
			int[] lista = funcoes.Bilhete();
			funcoes.PrintarLista(lista);
		}
		
		sc.close();
	}
	
	public int[] Bilhete(){
		Random random = new Random();
		int[] bilhete = new int[6];
		MegaSena funcoes = new MegaSena();
		
		for(int i = 0; i < bilhete.length; i++){
				int numeroGerado = random.nextInt(60)+1;
				boolean check = funcoes.MeuIn(bilhete, numeroGerado);
				if(!check) {
					bilhete[i] = numeroGerado;
				}else{
					while(true){
						numeroGerado = random.nextInt(60)+1;
						if(!(funcoes.MeuIn(bilhete, numeroGerado))) {
							bilhete[i] = numeroGerado;
							break;
						}else{
							numeroGerado = random.nextInt(60)+1;
						}
					}
				}
				
			}
		Arrays.sort(bilhete);
		return bilhete;
		}
	public boolean MeuIn(int[] lista,int numero) {
		for (int num : lista) {
			if(num == numero) {
				return true;
			}
		}
		
		return false;
	}
	
	public void PrintarLista(int[] lista) {
		System.out.print("# ");
		for(int num : lista){
			String numeroFormatado = String.format("%02d", num);
			System.out.print(numeroFormatado + " ");
		}
		System.out.println();
	}
}
