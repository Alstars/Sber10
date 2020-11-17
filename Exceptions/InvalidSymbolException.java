public class InvalidSymbolException extends  Exception {

    public InvalidSymbolException()
    {
        super("Invalid symbol. You can only input numbers");
    }

    public InvalidSymbolException(String message)
    {
        super(message);
    }
}
