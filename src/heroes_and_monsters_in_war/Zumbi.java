package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Zumbi extends Monstro {

    public Zumbi(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void atacarSer(Ser ser) throws SerException, AtacarException {
        
        super.atacarSer(ser);

        ser.retirarEnergia(1);

    } // atacarSer()

    @Override
    public void matouSer(ArrayList<Monstro> lista, Heroi heroi) {

        if (heroi.getEnergia() <= 0) {

            Monstro monstro;

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
