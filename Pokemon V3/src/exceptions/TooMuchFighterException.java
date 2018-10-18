package exceptions;

public class TooMuchFighterException extends Exception {
    @Override
    public String getMessage() {
        return "Il y a trop de combattant dans le tournoi";
    }
}
