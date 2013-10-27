package heroes_and_monsters_in_war;

public abstract class Ser {

    private String nome;
    private int idade;
    private double peso;
    private int energia;
    private int level;

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int Idade) {
        this.idade = Idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double Peso) {
        this.peso = Peso;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int Energia) {
        this.energia = Energia;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    // Ataca outro ser
    public void atacarSer() {
    } //atacarSer()

   
    // Retira pontos de energia do ser
    public void retirarEnergia(int qtd) {
        this.energia = this.energia - qtd;
    } // retirarEnergia()

    // Exibe informações de cada ser
    public void exibirInfo(int tipo) {
        if (tipo == 1) {
            System.out.println(this.getEnergia() + " - " + this.getNome() + " - " + this.getClass().getSimpleName());
        } else {
            System.out.println(this.getClass().getSimpleName() + " => " + this.getNome() + ", " + this.getIdade() + ", " + this.getPeso());
        }
        
    } // exibirInfo()
}
