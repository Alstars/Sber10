import java.util.Scanner;

public class Calculate implements Calculator {

    int input;

    public int getInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert value:");
        input = in.nextInt();
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    @Metric
    public int factcalc ()
    {
        int output = 1;
        for (int i=1; i<=input; i++)
        {
            output = output*i;
        }
        return (output);
    }
}
