package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Humano extends Heroi {

    public Humano(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void atacarSer(Ser ser) {

        ser.retirarEnergia(10);

    } // atacarSer()

    public void matouSer(ArrayList<Heroi> lista, Monstro monstro) {
    } // matouSer()
    
}