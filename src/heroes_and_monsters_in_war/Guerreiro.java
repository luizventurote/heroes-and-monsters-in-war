package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Guerreiro extends Heroi {
    
    private int veridiana = 0;
    
    public Guerreiro(String name, int idade, double peso) {
        
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

        // Verifica o tipo de monstro para atacar
        switch (monstro.getClass().getSimpleName()) {

            // Verifica se é um zumbi
            case "Zumbi":
                monstro.retirarEnergia(90);
                break;

            // Verifica se é um ogro:
            case "Ogro":
                monstro.retirarEnergia(30);
                break;

            // Verifica se é um bolha
            case "Bolha":
                monstro.retirarEnergia(60);
                break;

            // Verifica se é um elfo negro
            case "Elfo_Negro":
                monstro.retirarEnergia(2);
                break;

            // Verifica se é um bruxo:
            case "Bruxo":
                if(this.veridiana == 0)
                    monstro.retirarEnergia(1);
                else
                    monstro.retirarEnergia(100);
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