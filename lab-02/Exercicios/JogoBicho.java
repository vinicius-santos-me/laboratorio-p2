package aula;
import java.util.*;

public class JogoBicho {
	public static void main(String args[]) {
	JogoBicho jo = new JogoBicho();
	int[] bicho = jo.fazAposta();
	jo.imprimeAposta(bicho);
	}

	public String pegaBicho(int numero) {
		String[] bichos = {"Avestruz", "Águia","Burro","Borboleta","Cachorro","Cabra", "Carneiro","Camelo", "Cobra", "Coelho","Cavalo", "Elefante", "Galo", "Gato","Jacaré", "Leão", "Macaco","Porco", "Pavão","Peru","Touro","Tigre","Urso","Veado","Vaca"};
		if(numero > 0 && numero <= bichos.length) {
			return bichos[numero-1];
		}else{
			return "Número Inválido";
		}
		
	}
	public int[] fazAposta() {
		int[] aposta = new int[5];
		Random random = new Random();
		JogoBicho jo = new JogoBicho();
		
		for(int i = 0; i < aposta.length; i++){
			int numeroGerado = random.nextInt(25)+1;
			boolean check = jo.meuIn(aposta, numeroGerado);
			if(!check) {
				aposta[i] = numeroGerado;
			}else{
				while(true){
					numeroGerado = random.nextInt(25)+1;
					if(!(jo.meuIn(aposta, numeroGerado))) {
						aposta[i] = numeroGerado;
						break;
					}else{
						numeroGerado = random.nextInt(25)+1;
					}
				}
			}
			
		}
		Arrays.sort(aposta);
		return aposta;
		
	}
	public boolean meuIn(int[] numeros, int numero) {
		for(int num : numeros) {
			if(num == numero) {
				return true;
			}
		}
		return false;
	}
	public void imprimeAposta(int[] bilhete) {
		JogoBicho jo = new JogoBicho();
		for(int i = 0;i < bilhete.length;i++){
			String bichoSorteado = jo.pegaBicho(bilhete[i]);
			System.out.print(bichoSorteado + " ");
			}
		System.out.println();
		return;
	}
}