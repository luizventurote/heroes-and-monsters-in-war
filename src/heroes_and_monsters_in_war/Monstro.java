package heroes_and_monsters_in_war;

import java.util.ArrayList;

public abstract class Monstro extends Ser {

    public Monstro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public abstract void atacarSer(Ser ser);

    public abstract void matouSer(ArrayList<Monstro> lista, Heroi heroi);
}
