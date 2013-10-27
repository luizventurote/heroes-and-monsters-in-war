package heroes_and_monsters_in_war;

import java.util.ArrayList;

public class Ogro extends Monstro {
    
    private int clava = 0;

    public Ogro(String name, int idade, double peso) {

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
                heroi.retirarEnergia(60);
                break;

            // Verifica se é um guerreiro:
            case "Guerreiro":
                if(this.clava == 0) {
                    heroi.retirarEnergia(20);
                } else {
                    heroi.retirarEnergia(40);
                }
                break;

            // Verifica se é um anão
            case "Anao":
                if(this.clava == 0) {
                    heroi.retirarEnergia(50);
                } else {
                   heroi.retirarEnergia(90); 
                }
                break;

            // Verifica se é um elfo
            case "Elfo":
                heroi.retirarEnergia(3);
                break;

            // Verifica se é um mago:
            case "Mago":
                heroi.retirarEnergia(0);
                break;

            default:

        } // end switch

    } // atacarSer()
    

    @Override
    public void matouSer(ArrayList<Monstro> lista, Heroi heroi) {

        if (heroi.getEnergia() <= 0) {
            
            Monstro monstro = null;
            
            switch (heroi.getClass().getSimpleName()) {
                
                case "Anao":
                    this.clava = 1;
                    break;
                    
                case "Elfo":
                    this.clava = 1;
                    break;
                    
                case "Mago":
                    monstro = new Elfo_Negro(heroi.getNome(), heroi.getIdade(), heroi.getPeso());
                    lista.add(monstro);
                    break;
                    
                default:
                
            } // end switch

        } // end if

    } // matouSer()
}