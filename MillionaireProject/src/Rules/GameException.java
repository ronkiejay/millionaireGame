package Rules;

public class GameException extends Exception {

    public GameException()
    {
        super("Invalid Input");
    }

    public GameException(String string)
    {
        super(string);
    }


}
