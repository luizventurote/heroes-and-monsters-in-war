package heroes_and_monsters_in_war;

// Importações
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class LeitoraHerois {

    // Arquivo txt
    private String arquivo;
    // array lists
    ArrayList<Heroi> listaHerois = new ArrayList();

    public LeitoraHerois(String arquivo) {
        this.arquivo = arquivo;
    }

    public ArrayList<Heroi> getListaHerois() {
        return listaHerois;
    }

    // Cria a lista de heróis
    public ArrayList criarLista() {

        try {

            FileInputStream file = new FileInputStream(this.arquivo);

            Scanner scan = new Scanner(file);

            int tipo;
            Heroi heroi = null;

            // Loop que verifica os monstros
            while (scan.hasNext()) {

                tipo = scan.nextInt();

                // Verifica o tipo de monstro para cria os objetos
                switch (tipo) {

                    case 1:
                        heroi = new Humano(scan.next(), scan.nextInt(), scan.nextDouble());
                        break;

                    case 2:
                        heroi = new Guerreiro(scan.next(), scan.nextInt(), scan.nextDouble());
                        break;

                    case 3:
                        heroi = new Anao(scan.next(), scan.nextInt(), scan.nextDouble());
                        break;

                    case 4:
                        heroi = new Elfo(scan.next(), scan.nextInt(), scan.nextDouble());
                        break;

                    case 5:
                        heroi = new Mago(scan.next(), scan.nextInt(), scan.nextDouble());
                        break;
                    default:
                }

                listaHerois.add(heroi);

            } // End while

        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado!");
        } // End try

        return listaHerois;

    } // criarLista()

    // Exibibe os monstros que estão na lista
    public void exibirLista() {

        for (int i = 0; i < listaHerois.size(); i++) {
            System.out.println(listaHerois.get(i).getClass().getSimpleName() + " - " + listaHerois.get(i).getNome() + " - " + listaHerois.get(i).getIdade() + " - " + listaHerois.get(i).getPeso() + " - " + listaHerois.get(i).getEnergia());
        }

    } // exibirLista()

    // Verifica se algum ser da lista morreu
    public int verificarMorte() {

        for (int i = 0; i < listaHerois.size(); i++) {

            if (listaHerois.get(i).getEnergia() <= 0) {
                return 1;
            }

        } // end for

        return 0;

    } // verificarMorte()

    // Remove os mortos da lista
    public void removerMortos() {

        for (int i = 0; i < listaHerois.size(); i++) {

            if (listaHerois.get(i).getEnergia() <= 0) {
                listaHerois.remove(i);
            }

        }

    } // removerMortos()

    public void nextElement() {

        if ((!(listaHerois.isEmpty())) && (listaHerois.size() > 1)) {

            listaHerois.add(listaHerois.get(0));
            listaHerois.remove(0);

        } // end if

    } // nextElement()
}
