package p2lp2.coisa;
/**
* O Registro de tempo online, serve para ser o responsável para manter a informação sobre a quantidade de horas
* que o aluno tem dedicado a disciplina remota.
* @author Vinicius Santos Sousa
*/

public class RegistroTempoOnline {
	/**
	 * Nome da disciplina recebida.
	 */
	private String nomeDisciplina;
	/**
	 * Tempo online que o aluno se dedicou.
	 */
	private int tempoOnline;
	/**
	 * Tempo esperado da discplina, para aprovação.
	 */
	private int tempoEsperado;
	/**
	 * Meta de tempo , é um boolean que indica se o aluno atingiu a meta ou não foi atingida.
	 */
	private boolean metaTempoOnline;
	/**
	 * Constroi o registro de tempo, a partir do nome da disciplina.
	 * Toda registro de tempo , começa com uma disciplina.
	 * @param nomeDisciplina o nome da disciplina referente.
	 */
	public RegistroTempoOnline(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoEsperado = 120;
		}
	/**
	 * Construtor 2:
	 * Constroi o registro de tempo, a partir do nome da disciplina e o tempo de espera.
	 * Esse registro de tempo , começa com uma disciplina e seu tempo referente.
	 * @param nomeDisciplina o nome da disciplina referente.
	 * @param tempoOnline total de tempo online esperado da disciplina.
	 */
	public RegistroTempoOnline(String nomeDisciplina,int tempoOnlineEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoEsperado = tempoOnlineEsperado;
	}
	/**
	 * Metódo para adicionar tempo online para o aluno.
	 * @param tempo o tempo a ser adicionado.
	 */
	public void adicionaTempoOnline(int tempo) {
		this.tempoOnline += tempo;
	}
	/**
	 * Metódo que retorna um boolean , para saber se a meta foi atingida.
	 * @return a meta do aluno.
	 */
	public boolean atingiuMetaTempoOnline() {
		// ultilizar this. para melhor entendimento de qual variável tá sendo usada || Henrique 
		if(this.tempoOnline >= this.tempoEsperado) {
			this.metaTempoOnline = true;
		}
		return this.metaTempoOnline;
	}
	/**
	 * Retorna a string que representa o registro de tempo online, no formato:
	 * "Disciplina tempoOnline/tempoEsperado".
	 * @return a representação do registro de tempo. 
	 */
	public String toString() {
		return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoEsperado;
	}
	
}