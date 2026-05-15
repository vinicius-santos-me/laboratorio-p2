package p2lp2.coisa;
/**
* Representa o estado que o aluno se encontra, é importante acompanhar sua rotina de descanso.
* Para saber se é necessário descansar ou não.
* @author Vinicius Santos Sousa
*/

public class Descanso {
	/**
	 * Horas de descanso. São o total de horas que você descansou durante a semana(s).
	 */
	private int horasDescanso;
	/**
	 * Número de semanas, o total de semanas que você teve baseado em sua rotina.
	 */
	private int numeroSemanas;
	/**
	 * Metódo para definir as horas de descanso.
	 * @param horas o total horas descansadas.
	 */
	public void defineHorasDescanso(int horas) {
		this.horasDescanso = horas;
	}
	/**
	 * Metódo para definir o número de semanas.
	 * @param semanas o total de semanas para medir o descanso.
	 */
	public void defineNumeroSemanas(int semanas) {
		this.numeroSemanas = semanas;
	}
	/**
	 * Metodo para ver seu status.
	 * Retorna uma String, declarando se você está cansado ou descansado.
	 * @return retorna seu estado.
	 */
	public String getStatusGeral() {
		// usar o this. || Henrique
		if(this.numeroSemanas > 0 && (this.horasDescanso/this.numeroSemanas) >= 26) {
			return "descansado";
		}else{
			return "cansado";
		}
	}
}