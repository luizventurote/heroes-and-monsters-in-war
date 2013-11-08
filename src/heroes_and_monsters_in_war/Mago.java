package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Mago extends Heroi {

    public Mago(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void atacarSer(Ser ser) {

        ser.retirarEnergia(60);

    } // atacarSer()

    public void matouSer(ArrayList<Heroi> lista, Monstro monstro) {
    } // matouSer()
    
}