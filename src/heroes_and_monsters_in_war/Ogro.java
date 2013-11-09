package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Ogro extends Monstro {

    private int clava = 0;

    public Ogro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void atacarSer(Ser ser) throws SerException, AtacarException{
        
        super.atacarSer(ser);

        // Verifica o tipo de monstro para atacar
        switch (ser.getClass().getSimpleName()) {

            // Verifica se é um humano
            case "Humano":
                ser.retirarEnergia(60);
                break;

            // Verifica se é um guerreiro:
            case "Guerreiro":
                if (this.clava == 0) {
                    ser.retirarEnergia(20);
                } else {
                    ser.retirarEnergia(40);
                }
                break;

            // Verifica se é um anão
            case "Anao":
                if (this.clava == 0) {
                    ser.retirarEnergia(50);
                } else {
                    ser.retirarEnergia(90);
                }
                break;

            // Verifica se é um elfo
            case "Elfo":
                ser.retirarEnergia(3);
                break;

            // Verifica se é um mago:
            case "Mago":
                ser.retirarEnergia(0);
                break;

            default:
                ser.retirarEnergia(3);
                break;

        } // end switch

    } // atacarSer()

    @Override
    public void matouSer(ArrayList<Monstro> lista, Heroi heroi) {

        if (heroi.getEnergia() <= 0) {

            Monstro monstro = null;

            switch (heroi.getClass().getSimpleName()) {

                case "Anao":
                    this.clava = 1;
                    break;

                case "Elfo":
                    this.clava = 1;
                    break;

                case "Mago":
                    monstro = new Elfo_Negro(heroi.getNome(), heroi.getIdade(), heroi.getPeso());
                    lista.add(monstro);
                    break;

                default:

            } // end switch

        } // end if

    } // matouSer()
}