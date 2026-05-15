package p2lp2.coisa;
/**
* O Registro de resumos é a classe essencial para acompanhar os estudos, ele armazenará até
* uma certa quantidade limitada de resumos.
* @author Vinicius Santos Sousa
*/

public class RegistroResumos {
	/**
	 * Total de resumos adicionados.
	 */
    private int totalResumos;
    /**
     * Total de resumos que podem ser armazenados.
     */
    private int numeroResumos;
    /**
     * Array dos resumos para possivel acompanhamento posterior.
     */
    private Resumo[] resumosAdicionados;
    
    /**
     * Constroi o registro a partir de um numero recebido , para determinar a quantidade de resumos que poderá ser armazenada.
     * @param numeroDeResumos total de resumos que podem ser armazenados
     */
    public RegistroResumos(int numeroDeResumos) {
        this.resumosAdicionados = new Resumo[numeroDeResumos];
        this.totalResumos = 0;
        this.numeroResumos = numeroDeResumos;
    }
    /**
     * Adiciona o resumo no array, conferindo se o nao houver com o mesmo tema recebido.
     * @param tema tema do resumo
     * @param conteudo conteudo do resumo
     */
    public void adicionaResumo(String tema, String conteudo) {
        if (temResumo(tema)) {
            return; 
        }
        Resumo resumoAdicionar = new Resumo(tema, conteudo);
        this.resumosAdicionados[totalResumos % numeroResumos] = resumoAdicionar;
        this.totalResumos++;
    }
    /**
     * Verificador de resumos, confere se ja tem no array o mesmo recebido pelo parametro.
     * @param temaBuscar tema buscado para verificacao.
     * @return true se ja houver na lista ou false se nao houver
     */
    public boolean temResumo(String temaBuscar) {
        for (int i = 0; i < resumosAdicionados.length; i++) {
            if (resumosAdicionados[i] != null && resumosAdicionados[i].getTema().equals(temaBuscar)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Pega todos os resumos e os coloca dentro de um array de String, ja "formatado".
     * @return o array de string com os resumos
     */
    public String[] pegaResumos() {
        String[] resumos = new String[resumosAdicionados.length];
        for (int i = 0; i < resumosAdicionados.length; i++) {
            if (resumosAdicionados[i] != null) {
                resumos[i] = resumosAdicionados[i].getTema() + ": " + resumosAdicionados[i].getConteudo();
            }
        }
        return resumos;
    }
    /**
     * Retorna a quantidade de resumos ja cadastrados e logo abaixo os respectivos de temas de presentes atual.
     * @return um String mostrando quantidade de resumos cadastrados e seus temas
     */
    public String imprimeResumos() {
    	System.out.println("- " + totalResumos + " resumo(s) cadastrado(s)"); 
        for (int i = 0; i < totalResumos;i++) {
            if (i == totalResumos-1) {
                System.out.print(resumosAdicionados[i].getTema());
            }else{
            	System.out.print("- " +resumosAdicionados[i].getTema() + " | ");
            }
        }
        return "";
    }
    /**
     * Faz a contagem de resumos atualmente cadastrados.
     * @return total de resumos
     */
    public int contaResumos() {
        int totalDeResumosContados = 0;
        for (Resumo titulo : resumosAdicionados) {
            if (titulo != null) {
                totalDeResumosContados += 1;
            }
        }
        return totalDeResumosContados;
    }
}