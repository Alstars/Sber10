import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert value in fahrenheits:");
        float val = in.nextFloat();
        System.out.println("Temperature in celsius is:" + Converter.toCelsius(val));
        System.out.println("Temperature in kelvin is:" + Converter.toKelvin(val));
    }
}

class Converter {
    public static float toCelsius(float fDegrees)
    {
        float cDegrees = fDegrees;
        cDegrees = (cDegrees-32f)*5/9;
        return cDegrees;
    }

    public static float toKelvin(float fDegrees)
    {
        float kDegrees = fDegrees;
        kDegrees = (kDegrees-32f)*5/9+273.15f;
        return kDegrees;
    }
}