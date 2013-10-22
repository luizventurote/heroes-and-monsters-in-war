package heroes_and_monsters_in_war;

/**
 *
 * @author Luiz Alberto Binda Venturote - M19
 */
public class Jogo {

    public static void main(String[] args) {

        // Cria o objeto com os monstros
        Registro monstros = new Registro("monstros.txt");

        // Exibe o endereço do arquivo txt
        monstros.exibirEnderecoRegistro();

        // Faz a leitura dos seres
        monstros.exibirSeres();
        System.out.println("\n\n");
        
        // Cria os monstros
        monstros.CriarMonstros();
        
        
//        // Cria o objeto com os heróis
//        Registro herois = new Registro("herois.txt");
//
//        // Exibe o endereço do arquivo txt
//        herois.exibirEnderecoRegistro();
//
//        // Faz a leitura dos heróis
//        herois.lerRegistros();

    }
}
