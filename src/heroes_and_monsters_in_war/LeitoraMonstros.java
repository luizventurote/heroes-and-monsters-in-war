package heroes_and_monsters_in_war;

// Importações
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class LeitoraMonstros {

    // Arquivo txt
    private String arquivo;
    // array list
    ArrayList<Monstro> listaMonstros = new ArrayList();

    public LeitoraMonstros(String arquivo) {
        this.arquivo = arquivo;
    }

    public ArrayList<Monstro> getListaMonstros() {
        return listaMonstros;
    }

    // Cria a lista de monstros
    public void criarLista() {

        try {

            FileInputStream file = new FileInputStream(this.arquivo);

            Scanner scan = new Scanner(file);

            int tipo;
            Monstro monstro = null;

            // Loop que verifica os monstros no txt
            while (scan.hasNext()) {

                // Pega o tipo de monstro
                tipo = scan.nextInt();

                // Verifica o tipo de monstro para criar os objetos
                switch (tipo) {

                    case 1:
                        monstro = new Zumbi(scan.next(), scan.nextInt(), scan.nextDouble());
                        break;

                    case 2:
                        monstro = new Ogro(scan.next(), scan.nextInt(), scan.nextDouble());
                        break;

                    case 3:
                        monstro = new Bolha(scan.next(), scan.nextInt(), scan.nextDouble(), 1);
                        break;

                    case 4:
                        monstro = new Elfo_Negro(scan.next(), scan.nextInt(), scan.nextDouble());
                        break;

                    case 5:
                        monstro = new Bruxo(scan.next(), scan.nextInt(), scan.nextDouble());
                        break;

                } // end switch

                listaMonstros.add(monstro);

            } // End while

        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado!");
        } // End try

    } // criarLista()

    // Exibibe os monstros que estão na lista
    public void exibirLista() {

        for (int i = 0; i < listaMonstros.size(); i++) {
            System.out.println(listaMonstros.get(i).getClass().getSimpleName() + " - " + listaMonstros.get(i).getNome() + " - " + listaMonstros.get(i).getIdade() + " - " + listaMonstros.get(i).getPeso() + " - " + listaMonstros.get(i).getEnergia());
        }

    } // exibirLista()

    // Verifica se algum monstro morreu
    public int verificarMorte() {

        int j;

        for (int i = 0; i < listaMonstros.size(); i++) {
            if (listaMonstros.get(i).getEnergia() <= 0)
                return 1;
        } // end for

        return 0;

    } // verificarMorte()

    // Remove os mortos da lista
    public void removerMortos() {

        int j;

        for (int i = 0; i < listaMonstros.size(); i++) {

            if (listaMonstros.get(i).getEnergia() <= 0) {

                if ("Bolha".equals(listaMonstros.get(i).getClass().getSimpleName())) {
                    Monstro bolha;

                    switch (listaMonstros.get(i).getLevel()) {

                        case 1:
                            for (j = 0; j < 2; j++) {
                                bolha = new Bolha(listaMonstros.get(i).getNome(), listaMonstros.get(i).getIdade(), listaMonstros.get(i).getPeso(), 2);
                                listaMonstros.add(bolha);
                            }
                            break;

                        case 2:
                            for (j = 0; j < 2; j++) {
                                bolha = new Bolha(listaMonstros.get(i).getNome(), listaMonstros.get(i).getIdade(), listaMonstros.get(i).getPeso(), 4);
                                listaMonstros.add(bolha);
                            }
                            break;

                        case 4:
                            for (j = 0; j < 2; j++) {
                                bolha = new Bolha(listaMonstros.get(i).getNome(), listaMonstros.get(i).getIdade(), listaMonstros.get(i).getPeso(), 8);
                                listaMonstros.add(bolha);
                            }
                            break;

                        case 8:
                            for (j = 0; j < 2; j++) {
                                bolha = new Bolha(listaMonstros.get(i).getNome(), listaMonstros.get(i).getIdade(), listaMonstros.get(i).getPeso(), 16);
                                listaMonstros.add(bolha);
                            }
                            break;

                        case 16:
                            for (j = 0; j < 2; j++) {
                                bolha = new Bolha(listaMonstros.get(i).getNome(), listaMonstros.get(i).getIdade(), listaMonstros.get(i).getPeso(), 32);
                                listaMonstros.add(bolha);
                            }
                            break;

                        case 32:
                            for (j = 0; j < 2; j++) {
                                bolha = new Bolha(listaMonstros.get(i).getNome(), listaMonstros.get(i).getIdade(), listaMonstros.get(i).getPeso(), 64);
                                listaMonstros.add(bolha);
                            }
                            break;

                   } // end switch

                    System.out.println("uma bolha morreu!");

                    listaMonstros.remove(i);

                } else {

                    listaMonstros.remove(i);

                } // end if

            } // end if

        } // end for

    } // removerMortos()

    public void nextElement() {

        if ((!(listaMonstros.isEmpty())) && (listaMonstros.size() > 1)) {

            listaMonstros.add(listaMonstros.get(0));
            listaMonstros.remove(0);

        } // end if

    } // nextElement()
}
