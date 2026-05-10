package CoISA;

public class Descanso {
	private int horasDescanso;
	private int numeroSemanas;
	
	public void defineHorasDescanso(int horas) {
		this.horasDescanso = horas;
	}
	public void defineNumeroSemanas(int semanas) {
		this.numeroSemanas = semanas;
	}
	public String getStatusGeral() {
		if(numeroSemanas == 0) {
			return "Cansado";
		}else{
			int calculoStatus = horasDescanso/numeroSemanas;
			if(calculoStatus >= 26) {
				return "Descansado";
			}else{
			return "Cansado";
			}	
		}
	}
}