package CoISA;

public class Resumo {
	private String tema;
	private String conteudo;
	
	public Resumo(String temaCriar, String conteudoResumo) {
		this.tema = temaCriar;
		this.conteudo = conteudoResumo;
	}
	public String getTema() {
		return this.tema;
	}
	public String getConteudo() {
		return this.conteudo;
	}
}
