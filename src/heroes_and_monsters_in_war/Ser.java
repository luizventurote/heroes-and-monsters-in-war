package heroes_and_monsters_in_war;

public abstract class Ser {

    private String nome;
    private int idade;
    private double peso;
    private int energia;
    private int level;

    public Ser(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.energia = 100;
    }

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
    
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Retira pontos de energia do ser
    public void retirarEnergia(int qtd) {
        this.energia = this.energia - qtd;
    } // retirarEnergia()
    
    // Atacar ser
    public abstract void atacarSer(Ser ser) throws SerException, AtacarException; // atacarSer()

    // Exibe informações de cada ser
    public void exibirInfo(int tipo) {
        if (tipo == 1) {
            System.out.println(this.getEnergia() + " - " + this.getNome() + " - " + this.getClass().getSimpleName());
        } else {
            System.out.println(this.getClass().getSimpleName() + " => " + this.getNome() + ", " + this.getIdade() + ", " + this.getPeso());
        }

    } // exibirInfo()
}
