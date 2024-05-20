package HelloWorld;

import java.math.BigDecimal;
import java.math.MathContext;

public class Main
{
    public static void main(String[] args)
    {
        String num = "100000";

        if (args.length == 1){
            num = args[0];
        }

        String result = pi(num);

        System.out.println(result);    
    }


    public static String pi(String inStr){
        // Set the number of terms to calculate
        int n = Integer.parseInt(inStr);


        double startTime = System.nanoTime();

         // Set the precision to 100 decimal places
        MathContext mc = new MathContext(10000);

        // Initialize the sum to 0
        BigDecimal sum = new BigDecimal(0, mc);

        // Loop over the terms of the series
        for (int i = 1; i <= n; i++) {
        // Calculate the current term of the series
        BigDecimal term = new BigDecimal(4, mc).divide(new BigDecimal(2 * i - 1, mc), mc);

        // Add or subtract the term based on the parity
        if (i % 2 == 0) {
            sum = sum.subtract(term, mc);
        } else {
            sum = sum.add(term, mc);
        }
        }

        double elapsedTime= (System.nanoTime() - startTime);
        double time = elapsedTime/1_000_000_000;

        return time + " : Seconds ";
    }
}
