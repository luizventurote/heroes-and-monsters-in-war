package heroes_and_monsters_in_war;

public class AtacarException extends Exception {
    
    @Override
    public String getMessage() {
        return "O ser não sabe como atacar!";
    }
    
}
