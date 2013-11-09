package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Elfo extends Heroi {

    public Elfo(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void atacarSer(Ser ser) throws SerException {
        
        super.atacarSer(ser);

        // Aumenta energia
        int nova_energia = this.getEnergia() + 5;
        this.setEnergia(nova_energia);

    } // atacarSer()

    @Override
    public void matouSer(ArrayList<Heroi> lista, Monstro monstro) {
        
        switch (monstro.getClass().getSimpleName()) {

            case "Elfo_Negro":
                monstro.retirarEnergia(100);
                Heroi heroi = new Elfo(monstro.getNome(), monstro.getIdade(), monstro.getPeso());
                lista.add(heroi);
                break;

            default:
                monstro.retirarEnergia(15);

        } // end switch
        
    } // matouSer()
}