package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Elfo_Negro extends Monstro {

    public Elfo_Negro(String name, int idade, double peso) {
        
        // Adiciona o nome no ser
        this.setNome(name);
        
        // Adiciona a idade no ser
        this.setIdade(idade);
        
        // Adiciona o peso no ser
        this.setPeso(peso);
        
        // Adiciona a energia no ser
        this.setEnergia(100);
        
    }
    
    
    @Override
    public void atacarSer(Heroi heroi) {

        // Verifica o tipo de monstro para atacar
        switch (heroi.getClass().getSimpleName()) {

            // Verifica se é um humano
            case "Humano":
                heroi.retirarEnergia(5);
                break;

            // Verifica se é um guerreiro:
            case "Guerreiro":
                heroi.retirarEnergia(5);
                break;

            // Verifica se é um anão
            case "Anao":
                heroi.retirarEnergia(5);
                break;

            // Verifica se é um elfo
            case "Elfo":
                heroi.retirarEnergia(5);
                break;

            // Verifica se é um mago:
            case "Mago":
                heroi.retirarEnergia(100);
                break;

        default:

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
