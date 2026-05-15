package p2lp2.coisa;
/**
* Classe resumo foi criada mais como um auxilio , para ajudar no registro dos resumos.
* Todo resumo precisa ter seu tema e conteudo.
* @author Vinicius Santos Sousa
*/


public class Resumo {
	/**
	 * Tema do resumo.
	 */
	private String tema;
	/**
	 * Conteudo do resumo.
	 */
	private String conteudo;
	
	/**
	 * Constroi o resumo a partir de seu tema e conteudo recebidos.
	 * @param temaCriar tema recebido
	 * @param conteudoResumo conteudo do resumo recebido
	 */
	public Resumo(String temaCriar, String conteudoResumo) {
		this.tema = temaCriar;
		this.conteudo = conteudoResumo;
	}
	/**
	 * Retornar o tema do resumo procurado.
	 * @return tema do resumo
	 */
	public String getTema() {
		return this.tema;
	}
	/**
	 * Retornar o conteudo do resumo procurado.
	 * @return conteudo do resumo
	 */
	public String getConteudo() {
		return this.conteudo;
	}
}