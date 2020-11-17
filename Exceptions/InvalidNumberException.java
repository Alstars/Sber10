public class InvalidNumberException extends  Exception{
    public InvalidNumberException()
    {
        super("Invalid number. It should be multiple of 100");
    }

    public InvalidNumberException(String message){
        super(message);
    }


}

