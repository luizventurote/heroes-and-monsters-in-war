package heroes_and_monsters_in_war;

public class Jogo {

    public static void main(String[] args) {

        // Arquivos txt
        String arquivo_monstros = "monstros.txt";
        String arquivo_herois = "herois.txt";


        System.out.println("\nMonstros ----------------------------------- //");
        // Inicia lista de monstros
        LeitoraMonstros monstros = new LeitoraMonstros(arquivo_monstros);
        monstros.criarLista();
        monstros.exibirLista();


        System.out.println("\nHeróis ------------------------------------- //");
        // Inicia lista de heróis
        LeitoraHerois herois = new LeitoraHerois(arquivo_herois);
        herois.criarLista();
        herois.exibirLista();


        System.out.println("\nBatalha ------------------------------------ //");
        // Inicia a batalha
        Batalha batalha = new Batalha(herois, monstros);

        try {
            
            batalha.iniciarBatalha();
            
            
            System.out.println("Resultado da Batalha ----------------------- //");
            batalha.exibirResultados();
            
        } catch (SerException erro) {
            
            System.out.println(erro.getMessage());
            
        } catch (AtacarException erro) {
            
            System.out.println(erro.getMessage());
            
        } // end try
        
    }
}
