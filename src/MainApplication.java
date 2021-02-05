import converter.LengthConverter;

import java.util.Scanner;

public class MainApplication {

    public static  void  main (String[] ags){
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Convert from: ");
            String fromUnit = in.nextLine();

            System.out.print("Convert to: ");
            String toUnit = in.nextLine();

            LengthConverter from = new LengthConverter(fromUnit);
            LengthConverter to = new LengthConverter(toUnit);
            System.out.print("value: ");
            double val = in.nextDouble();

            Double meter = from.toMeter(val);
            Double converted = to.fromMeter(meter);
            System.out.println(converted.doubleValue());
        }catch (Throwable ex){
            System.out.println(ex.getMessage());
        }
    }
}
