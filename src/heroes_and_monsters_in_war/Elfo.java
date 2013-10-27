package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Elfo extends Heroi {
    
    public Elfo(String name, int idade, double peso) {
        
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
    public void atacarSer(ArrayList<Heroi> lista, Monstro monstro) {
        
        // Aumenta energia
        int nova_energia = this.getEnergia() + 5;
        this.setEnergia(nova_energia);
        
        
        switch (monstro.getClass().getSimpleName()) {
                    
                case "Elfo_Negro":
                    monstro.retirarEnergia(100);
                    Heroi heroi = new Elfo(monstro.getNome(), monstro.getIdade(), monstro.getPeso());
                    lista.add(heroi);
                    break;
                    
                default:
                    monstro.retirarEnergia(15);
                
            } // end switch

    } // atacarSer()
    
}