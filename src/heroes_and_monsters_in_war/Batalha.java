package heroes_and_monsters_in_war;

public class Batalha {

    // Listas
    LeitoraHerois herois;
    LeitoraMonstros monstros;
    
    // Últimos lutadores
    Heroi ultimo_heroi = null;
    Monstro ultimo_monstro = null;

    public Batalha(LeitoraHerois herois, LeitoraMonstros monstros) {
        this.herois = herois;
        this.monstros = monstros;
    }

    // Inicia a Batalha
    public void iniciarBatalha() {

        while ((herois.getListaHerois().size() > 0) && (monstros.getListaMonstros().size() > 0)) {
            
            // Herói ataca
            herois.getListaHerois().get(0).atacarSer(herois.getListaHerois(), monstros.getListaMonstros().get(0));

            // Monstro ataca
            monstros.getListaMonstros().get(0).atacarSer(herois.getListaHerois().get(0));
            
            // Informações da batalha
            ultimo_heroi = herois.getListaHerois().get(0);
            ultimo_monstro = monstros.getListaMonstros().get(0);
            herois.getListaHerois().get(0).exibirInfo(1);
            monstros.getListaMonstros().get(0).exibirInfo(1);

            // Verifica se algum monstro morreu
            if (monstros.verificarMorte() == 1) {

                herois.getListaHerois().get(0).matouSer(herois.getListaHerois(), monstros.getListaMonstros().get(0));

                // Remove os monstros mortos da lista
                monstros.removerMortos();

            } // end if

            // Verifica se algum herói morreu
            if (herois.verificarMorte() == 1) {

                monstros.getListaMonstros().get(0).matouSer(monstros.getListaMonstros(), herois.getListaHerois().get(0));

                herois.removerMortos();

            } // end if

            // anda com as listas
            herois.nextElement();
            monstros.nextElement();

            System.out.println();

        } // end while
        
    } // end iniciarBatalha()
    
    
    // Exibi resultado final da batalha
    public void exibirResultados() {
        
        if(!(herois.getListaHerois().isEmpty())) {
            
            System.out.println("A categoria vencedora foi: Heróis");
            System.out.println("\nO último membro da categoria perdedora foi:");
            ultimo_monstro.exibirInfo(2);
            System.out.println("\nO membro da categoria vencedora que transferiu \no último ataque foi:");
            ultimo_heroi.exibirInfo(2);
            
        } else {
            
            System.out.println("A categoria vencedora foi: Monstros");
            System.out.println("\nO último membro da categoria perdedora foi:");
            ultimo_heroi.exibirInfo(2);
            System.out.println("\nO membro da categoria vencedora que transferiu \no último ataque foi:");
            ultimo_monstro.exibirInfo(2);
        }
        
    } // exibirResultados()
}
