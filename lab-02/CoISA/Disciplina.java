package CoISA;

public class Disciplina {
	private String nomeDisciplina;
	private int totalHoras;
	private double[] notasDisciplinas;
	private boolean aprovacao;
	private double mediaAluno;
	
	public Disciplina(String nomeDisciplina){
		this.nomeDisciplina = nomeDisciplina;
		this.notasDisciplinas = new double[4];
	}
	public void cadastraHoras(int horas) {
		this.totalHoras += horas;
	}
	public void cadastraNota(int nota, double valorNota) {
		this.notasDisciplinas[nota-1] = valorNota;
	}
	public boolean aprovado(){
		double notas = Media();
		this.mediaAluno = notas;
		if(notas >= 7) {
			this.aprovacao = true;
		}
		return aprovacao;
	}
	public double Media(){
		double total = 0;
		for(int i = 0; i < notasDisciplinas.length; i++) {
			total += notasDisciplinas[i];
		}
		return total/4;
	}
	public String toString(){
		double notas = Media();
		this.mediaAluno = notas;
		System.out.println("Disciplina: " + this.nomeDisciplina + "\nTotal de horas estudadas: " + this.totalHoras + "\nMedia do Aluno: " + this.mediaAluno);
		for(int i = 0;i < notasDisciplinas.length;i++){
			System.out.println("Nota " + (i+1) + ": "+ notasDisciplinas[i]);
		}
		return "";
	}
}
