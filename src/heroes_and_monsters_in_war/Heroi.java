package heroes_and_monsters_in_war;

import java.util.ArrayList;

public abstract class Heroi extends Ser {

    public Heroi(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public abstract void matouSer(ArrayList<Heroi> lista, Monstro monstro);

    @Override
    public void atacarSer(Ser ser) throws SerException{
        
        if(!(ser instanceof Monstro)) {
            throw new SerException(this, ser);
        }
        
    } // atacarSer()

}
