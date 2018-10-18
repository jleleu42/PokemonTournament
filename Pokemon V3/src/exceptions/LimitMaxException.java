package exceptions;

public class LimitMaxException extends Exception {
    @Override
    public String getMessage() {
        return "Le tournois a atteind le nombre maximum du joueur";
    }
}
