package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Zumbi extends Monstro {

    public Zumbi(String name, int idade, double peso) {

        // Adiciona o nome no ser
        this.setNome(name);

        // Adiciona a idade no ser
        this.setIdade(idade);

        // Adiciona o peso no ser
        this.setPeso(peso);

        // Adiciona a energia no ser
        this.setEnergia(100);

    }

    
    @Override
    public void atacarSer(Heroi heroi) {

        heroi.retirarEnergia(1);

    } // atacarSer()
    

    @Override
    public void matouSer(ArrayList<Monstro> lista, Heroi heroi) {

        if (heroi.getEnergia() <= 0) {

            Monstro monstro = null;

            switch (heroi.getClass().getSimpleName()) {

                case "Mago":
                    monstro = new Elfo_Negro(heroi.getNome(), heroi.getIdade(), heroi.getPeso());
                    break;

                default:
                    monstro = new Zumbi(heroi.getNome(), heroi.getIdade(), heroi.getPeso());

            } // end switch

            lista.add(monstro);

        } // end if

    } // matouSer()
}
