package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Guerreiro extends Heroi {

    private int veridiana = 0;

    public Guerreiro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void atacarSer(Ser ser) throws SerException {
        
        super.atacarSer(ser);

        // Verifica o tipo de monstro para atacar
        switch (ser.getClass().getSimpleName()) {

            // Verifica se é um zumbi
            case "Zumbi":
                ser.retirarEnergia(90);
                break;

            // Verifica se é um ogro:
            case "Ogro":
                ser.retirarEnergia(30);
                break;

            // Verifica se é um bolha
            case "Bolha":
                ser.retirarEnergia(60);
                break;

            // Verifica se é um elfo negro
            case "Elfo_Negro":
                ser.retirarEnergia(2);
                break;

            // Verifica se é um bruxo:
            case "Bruxo":
                if (this.veridiana == 0) {
                    ser.retirarEnergia(1);
                } else {
                    ser.retirarEnergia(100);
                }
                break;

            default:

        } // end switch

    } // atacarSer()

    @Override
    public void matouSer(ArrayList<Heroi> lista, Monstro monstro) {

        if (monstro.getEnergia() <= 0) {

            switch (monstro.getClass().getSimpleName()) {

                case "Bolha":
                    this.veridiana = 1;
                    break;

                case "Elfo_Negro":
                    this.veridiana = 1;
                    break;

                default:

            } // end switch

        } // end if

    } // matouSer()
}