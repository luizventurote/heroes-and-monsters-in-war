package heroes_and_monsters_in_war;

// Importações
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Luiz
 */
public class Registro {

    // Guarda o endereço do arquivo
    private String arquivo;
    // Guarda as informações do arquivo
    private String conteudo;

    // Construtor
    public Registro(String arquivo) {

        this.arquivo = arquivo;

    }

    public void exibirEnderecoRegistro() {
        System.out.println(" Endereço do registro: " + this.arquivo);
    }

    // Faz a leitura do arquivo
    public void exibirSeres() {

        try {

            FileInputStream file = new FileInputStream(this.arquivo);
            
            try (Scanner scan = new Scanner(file)) {
                
                while (scan.hasNextLine()) {  
                    
                    System.out.println(scan.nextLine());
                    
                } // End while
                
            }

        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado!");
        } // End try

    }
    
    
    // Cria os monstros
    public void CriarMonstros() {

        try {

            FileInputStream file = new FileInputStream(this.arquivo);
            
            try (Scanner scan = new Scanner(file)) {
                
                int i=0, postion=0;
                
                
                // Array de zumbis
                Zumbi zumbis[];
                zumbis = new Zumbi[100];
                
                // Array de ogros
                Ogro ogros[];
                ogros = new Ogro[100];
                
                // Loop que verifica os mosntros
                while (scan.hasNextLine()) { 
                    
                    postion = scan.nextInt();
                    
                    // Verifica se existe um zumbi
                    if(postion == 1) {
                        
                        // Cria um objeto
                        zumbis[i] = new Zumbi();
                
                        // Adiciona o nome no ser
                        zumbis[i].setNome(scan.next());
                        
                        // Adiciona a idade no ser
                        zumbis[i].setIdade(scan.nextInt());
                        
                        // Adiciona a idade no ser
                        zumbis[i].setPeso(scan.nextInt());
                        
                        // Adiciona a Energia no ser
                        zumbis[i].setEnergia(100);
                        
                        // Imprime as características do ser
                        System.out.println(zumbis[i].getNome()+" - "+zumbis[i].getIdade()+" - "+zumbis[i].getPeso());
                
                    }
                    
                    // Verifica se existe um zumbi
                    if(postion == 2) {
                        
                        // Cria um objeto
                        ogros[i] = new Ogro();
                
                        // Adiciona o nome no ser
                        ogros[i].setNome(scan.next());
                        
                        // Adiciona a idade no ser
                        ogros[i].setIdade(scan.nextInt());
                        
                        // Adiciona a idade no ser
                        ogros[i].setPeso(scan.nextInt());
                        
                        // Adiciona a Energia no ser
                        ogros[i].setEnergia(100);
                        
                        // Imprime as características do ser
                        System.out.println(ogros[i].getNome()+" - "+ogros[i].getIdade()+" - "+ogros[i].getPeso());
                
                    }
                    
                    i++;
                    
                    // ERRO ------------------------------------------------------------ //
                    // Passa para próxima linha
                    scan.nextLine();
        
                } // End while
                
            }

        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado!");
        } // End try

    }
}
