package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Elfo_Negro extends Monstro {

    public Elfo_Negro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void atacarSer(Ser ser) {
        
        super.atacarSer(ser);
        
        // Verifica o tipo de monstro para atacar
        switch (ser.getClass().getSimpleName()) {

            // Verifica se é um humano
            case "Humano":
                ser.retirarEnergia(5);
                break;

            // Verifica se é um guerreiro:
            case "Guerreiro":
                ser.retirarEnergia(5);
                break;

            // Verifica se é um anão
            case "Anao":
                ser.retirarEnergia(5);
                break;

            // Verifica se é um elfo
            case "Elfo":
                ser.retirarEnergia(5);
                break;

            // Verifica se é um mago:
            case "Mago":
                ser.retirarEnergia(100);
                break;

            default:
                ser.retirarEnergia(5);
                break;

        } // end switch

    } // atacarSer()

    @Override
    public void matouSer(ArrayList<Monstro> lista, Heroi heroi) {

        if (heroi.getEnergia() <= 0) {

            Monstro monstro = null;

            switch (heroi.getClass().getSimpleName()) {

                case "Mago":
                    heroi.setEnergia(0);
                    lista.remove(0);

                    monstro = new Elfo_Negro(heroi.getNome(), heroi.getIdade(), heroi.getPeso());
                    lista.add(monstro);
                    break;

            } // end switch

        } // end if

    } // matouSer()
}
