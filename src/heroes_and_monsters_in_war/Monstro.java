package heroes_and_monsters_in_war;

import java.util.ArrayList;

public abstract class Monstro extends Ser {

    public Monstro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public abstract void matouSer(ArrayList<Monstro> lista, Heroi heroi);
    
    @Override
    public void atacarSer(Ser ser) throws SerException, AtacarException {
        
        if(!((ser instanceof Monstro) || (ser instanceof Heroi))) {
            throw new SerException(this, ser);
        }  
        
        if(!(ser instanceof Heroi)) {
            throw new AtacarException();
        }
        
    } // atacarSer()
    
}
