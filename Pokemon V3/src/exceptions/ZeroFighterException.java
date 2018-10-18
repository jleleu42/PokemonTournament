package exceptions;

public class ZeroFighterException extends Exception {
    @Override
    public String getMessage() {
        return "Pour combattre, il faut au moins 2 combattants";
    }
}
