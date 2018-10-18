package exceptions;

public class NbFighterException extends Exception {
    @Override
    public String getMessage() {
        return "Nombre de combattant incorrect. Pour faire du 1 vs 1, il faut obligatoirement un nombre pair de combattant";
    }
}
