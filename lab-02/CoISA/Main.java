package CoISA;

public class Main {
    public static void main(String[] args) {
        Descanso descanso = new Descanso();
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(30);
        descanso.defineNumeroSemanas(1);
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(26);
        descanso.defineNumeroSemanas(2);
        System.out.println("---");
        
        
        
        RegistroTempoOnline LP2 = new RegistroTempoOnline("LP2", 30);
        LP2.adicionaTempoOnline(10);
        System.out.println("LP2 ATINGIU A META? " + LP2.atingiuMetaTempoOnline());
        LP2.adicionaTempoOnline(2);
        System.out.println("\n" + LP2.toString());
        RegistroTempoOnline P2 = new RegistroTempoOnline("P2");
        P2.adicionaTempoOnline(120);
        System.out.println("\n" + P2.toString());
        System.out.println("P2 ATINGIU A META? " + P2.atingiuMetaTempoOnline());
   
        System.out.println("---");
   
        Disciplina prog2 = new Disciplina("PROGRAMACAO 2");
        prog2.cadastraHoras(4);
        prog2.cadastraNota(1, 9.0);
        prog2.cadastraNota(2, 8.5);
        prog2.cadastraNota(3, 10.0);
        prog2.cadastraNota(4, 10.0);
        System.out.println(prog2.toString());
        System.out.println(prog2.aprovado());
   

        System.out.println("---");
        
        RegistroResumos meusResumos = new RegistroResumos(100);
        meusResumos.adicionaResumo("Tema 1", "Conteudo 1");
        meusResumos.adicionaResumo("Tema 2", "Conteudo 2");

        String[] resumos = meusResumos.pegaResumos();
        for (int i = 0; i < meusResumos.contaResumos(); i++) {
            System.out.println(resumos[i]);
        }

        System.out.println();
        System.out.println("Resumos: ");
        System.out.println(meusResumos.imprimeResumos());
        System.out.println(meusResumos.temResumo("Tema 1"));
        System.out.println(meusResumos.temResumo("Exemplo"));
    }
}