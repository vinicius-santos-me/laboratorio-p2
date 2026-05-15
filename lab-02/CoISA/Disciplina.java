package p2lp2.coisa;

import java.util.Arrays;

/**
* Por padrão cada disciplina tem 4 notas, todo alunp é considerado aprovado ou reprovado.
* Esse classe, ira verficar sua aprovação.
* 
* @author Vinicius Santos Sousa
*/

public class Disciplina {
	/**
	 * Nome da disciplina.
	 */
	private String nomeDisciplina;
	/**
	 * Total de horas de estudo.
	 */
	private int totalHoras;
	/**
	 * Array das notas do aluno.
	 */
	private double[] notasDisciplinas;
	/**
	 * Verificador booleano da aprovação.
	 */
	private boolean aprovacao;
	/**
	 * Média do aluno.
	 */
	private double mediaAluno;
	
	/**
	 * Constroi a disciplina a partir do nome recebido.
	 * Assim toda disciplina inicializa com seu nome e seu array de tamanho 4.
	 * @param nomeDisciplina o nome da disciplina.
	 */
	public Disciplina(String nomeDisciplina){
		this.nomeDisciplina = nomeDisciplina;
		this.notasDisciplinas = new double[4];
	}
	/**
	 * Cadastra as horas da disciplina.
	 * @param horas as horas recebidas para a disciplina.
	 */
	public void cadastraHoras(int horas) {
		this.totalHoras += horas;
	}
	/**
	 * Cadastramento de nota, onde são recebidas as suas notas.
	 * @param nota qual nota foi recebida entre 1 e 4.
	 * @param valorNota valor da sua prova que você tirou.
	 */
	public void cadastraNota(int nota, double valorNota) {
		this.notasDisciplinas[nota-1] = valorNota;
	}
	/**
	 * Verifica se o aluno foi aprovado.
	 * @return retorna false se foi reprovado ou true se foi aprovado.
	 */
	public boolean aprovado(){
		double notas = Media();
		this.mediaAluno = notas;
		if(notas >= 7) {
			this.aprovacao = true;
		}
		// colocar o this. || Henrique
		return this.aprovacao;
	}
	/**
	 * Calcula a media do aluno.
	 * @return retorna sua media calculada.
	 */
	public double Media(){
		double total = 0;
		// colocar o this. || Henrique
		for(int i = 0; i < this.notasDisciplinas.length; i++) {
			total += this.notasDisciplinas[i];
		}
		return total/4;
	}
	/**
	 * Retorna uma string representando a disciplina, no formato:
	 * "DISCIPLINA + HORAS + MEDIA ALUNO + ARRAY DAS NOTAS"
	 * @return String da representação da classe Disciplina.
	 */
	public String toString(){
		return this.nomeDisciplina + " " + this.totalHoras + " " + this.mediaAluno + " " + Arrays.toString(this.notasDisciplinas);
	}
}
