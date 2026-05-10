package CoISA;

public class RegistroResumos {
    private int totalResumos;
    private int numeroResumos;
    private Resumo[] resumosAdicionados;

    public RegistroResumos(int numeroDeResumos) {
        this.resumosAdicionados = new Resumo[numeroDeResumos];
        this.totalResumos = 0;
        this.numeroResumos = numeroDeResumos;
    }

    public void adicionaResumo(String tema, String conteudo) {
        if (temResumo(tema)) {
            return; 
        }
        Resumo resumoAdicionar = new Resumo(tema, conteudo);
        this.resumosAdicionados[totalResumos % numeroResumos] = resumoAdicionar;
        this.totalResumos++;
    }

    public boolean temResumo(String temaBuscar) {
        for (int i = 0; i < resumosAdicionados.length; i++) {
            if (resumosAdicionados[i] != null && resumosAdicionados[i].getTema().equals(temaBuscar)) {
                return true;
            }
        }
        return false;
    }

    public String[] pegaResumos() {
        String[] resumos = new String[resumosAdicionados.length];
        for (int i = 0; i < resumosAdicionados.length; i++) {
            if (resumosAdicionados[i] != null) {
                resumos[i] = resumosAdicionados[i].getConteudo();
            }
        }
        return resumos;
    }

    public String imprimeResumos() {
        for (Resumo resumo : resumosAdicionados) {
            if (resumo != null) {
                System.out.println(resumo.getConteudo());
            }
        }
        return "";
    }

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