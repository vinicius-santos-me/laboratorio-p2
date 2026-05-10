package CoISA;

public class RegistroTempoOnline {
	private String nomeDisciplina;
	private int tempoOnline;
	private int tempoEsperado;
	private boolean metaTempoOnline;
	
	public RegistroTempoOnline(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoEsperado = 120;
		}
	public RegistroTempoOnline(String nomeDisciplina,int tempoOnlineEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoEsperado = tempoOnlineEsperado;
	}
	
	public void adicionaTempoOnline(int tempo) {
		this.tempoOnline += tempo;
	}

	public boolean atingiuMetaTempoOnline() {
		if(tempoOnline >= tempoEsperado) {
			this.metaTempoOnline = true;
		}
		return metaTempoOnline;
	}
	public String toString() {
		return "Disciplina: " + this.nomeDisciplina + "\nTempo Online: " + this.tempoOnline + " Horas"+ "\nTempo Esperado: " + this.tempoEsperado + " Horas";
	}
	
}