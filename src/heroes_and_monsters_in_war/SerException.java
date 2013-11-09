package heroes_and_monsters_in_war;

public class SerException extends Exception {
    
    private Ser ser_a, ser_b;

    public SerException(Ser ser_a, Ser ser_b) {
        
        this.ser_a = ser_a;
        this.ser_b = ser_b;
        
    }

    @Override
    public String getMessage() {
        return "O(a) "+ser_a.getClass().getSimpleName()+" "+ser_a.getNome()+" não consegue atacar o(a) "+ser_b.getClass().getSimpleName()+" "+ser_b.getNome()+"!";
    }
    
}
