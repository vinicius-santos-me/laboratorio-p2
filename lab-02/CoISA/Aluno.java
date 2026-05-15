package p2lp2.coisa;
/**
* Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
* por esta matrícula.
* 
* @author Vinicius Santos Sousa
*/


public class Aluno {
	/**
	* Matrícula do aluno. No formato 2XXXYYZZZ onde XX é o ano e 
	* semestre de entrada, YY é o código do curso e ZZ é um identificador * do aluno no curso.
	*/
	private String matricula;
	/**
	 * Nome do aluno.
	 */
	private String nome;
	/**
	 * Ano do nascimento do aluno referente.
	 */
	private int anoNascimento;
	/**
	 * CRA = Média de todas as notas do aluno. Recebida em formato double.
	 */
	private double cra;
	/**
	* Constrói um aluno a partir de sua matrícula e nome.
	* Todo aluno começa com o campo CRA como nulo.
	*
	* @param matricula a matrícula do aluno, no formato “0000000000”
	* @param nome o nome do aluno
	* @param anoNascimento ano de nascimento do aluno.
	*/
	public Aluno(String matricula,String nome, int anoNascimento) {
		this.nome = nome;
		this.cra = 0.0;
		this.anoNascimento = anoNascimento;
		this.matricula = matricula;
}
	/**
	 * É um metodo para setar o cra do aluno, que é media total de todas as suas notas.
	 * @param cra o cra do aluno para ser setado.
	 */
	public void setCra(double cra) {
		this.cra = cra;
}
	/**
	 * Retorna a idade do aluno referente.
	 * @return um número inteiro representando sua idade.
	 */
	public int getIdade() {
		return 2021 - anoNascimento;
}
	/**
	* Retorna a String que representa o aluno. A representação segue o 
	* formato “MATRICULA - Nome do Aluno”.
	*
	* @return a representação em String de um aluno.
	*/
	public String toString() {
		return "Aluno - "  + this.nome;
	}

}