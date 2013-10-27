package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Bolha extends Monstro {

    private static int b1, b2, b4, b8, b16, b32, b64;

    public Bolha(String name, int idade, double peso, int level) {

        // Adiciona o nome no ser
        this.setNome(name);

        // Adiciona a idade no ser
        this.setIdade(idade);

        // Adiciona o peso no ser
        this.setPeso(peso);

        // Adiciona a energia no ser        
        this.setEnergia(100 / level);

        // Adiciona o level no ser
        this.setLevel(level);

        // Gerencia a quantidade de bolhas criadas
        switch (level) {

            case 1:
                b1++;
                break;

            case 2:
                b2++;
                break;

            case 4:
                b4++;
                break;

            case 8:
                b8++;
                break;

            case 16:
                b16++;
                break;

            case 32:
                b32++;
                break;

            case 64:
                b64++;
                break;

            default:

        } // end switch

    }


    // Exibe a quantidade de bolhas que foram criadas
    public static void qtdBolhas() {
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b4);
        System.out.println(b8);
        System.out.println(b16);
        System.out.println(b32);
        System.out.println(b64);
    } // qtdBolhas()

    
    @Override
    public void atacarSer(Heroi heroi) {

        // Verifica o tipo de monstro para atacar
        switch (heroi.getClass().getSimpleName()) {

            // Verifica se é um humano
            case "Humano":
                heroi.retirarEnergia(1);
                break;

            // Verifica se é um guerreiro:
            case "Guerreiro":
                heroi.retirarEnergia(1);
                break;

            // Verifica se é um anão
            case "Anao":
                heroi.retirarEnergia(1);
                break;

            // Verifica se é um elfo
            case "Elfo":
                heroi.retirarEnergia(10);
                break;

            // Verifica se é um mago:
            case "Mago":
                heroi.retirarEnergia(1);
                break;

            default:

        } // end switch

    } // atacarSer()

    
    @Override
    public void matouSer(ArrayList<Monstro> lista, Heroi heroi) {

        if (heroi.getEnergia() <= 0) {

            Monstro monstro = null;

            switch (heroi.getClass().getSimpleName()) {

                case "Mago":
                    monstro = new Elfo_Negro(heroi.getNome(), heroi.getIdade(), heroi.getPeso());
                    lista.add(monstro);
                    break;

                default:

            } // end switch

        } // end if

    } // matouSer()
}
