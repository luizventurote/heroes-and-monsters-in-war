package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Anao extends Heroi {

    private int machado = 0;

    public Anao(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void atacarSer(Ser ser) {

        // Verifica o tipo de monstro para atacar
        switch (ser.getClass().getSimpleName()) {

            // Verifica se é um zumbi
            case "Zumbi":
                ser.retirarEnergia(10);
                break;

            // Verifica se é um ogro:
            case "Ogro":
                ser.retirarEnergia(5);
                break;

            // Verifica se é um bolha
            case "Bolha":
                ser.retirarEnergia(50);
                break;

            // Verifica se é um elfo negro
            case "Elfo_Negro":
                if (machado == 0) {
                    ser.retirarEnergia(25);
                } else {
                    ser.retirarEnergia(100);
                }

                break;

            // Verifica se é um bruxo:
            case "Bruxo":
                ser.retirarEnergia(2);
                break;

            default:

        } // end switch

    } // atacarSer()

 
    public void matouSer(ArrayList<Heroi> lista, Monstro monstro) {

        if (monstro.getEnergia() <= 0) {

            switch (monstro.getClass().getSimpleName()) {

                case "Bolha":
                    this.machado = 1;
                    break;

            } // end switch

        } // end if

    } // matouSer()
}