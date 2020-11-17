import java.io.InvalidClassException;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] Arg) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input your bank ID");
        try {
            if (keyboard.hasNextInt()){
                throw new InvalidSymbolException();
                                }
            int num = keyboard.nextInt();
            if (num % 100 != 0) {
                throw new InvalidNumberException();
            }

        }
        catch (InvalidNumberException | InvalidSymbolException e){
            System.out.println((e.getMessage()));
        }
}
}



