package NumberAndRangeSummarizer;

import java.util.ArrayList;
import java.util.Collection;

public class App
{
    public static void main( String[] args )
    {
        NumberAndRangeSummarizer obj = new NumberAndRangeSummarizer();
        Collection<Integer> input = new ArrayList<>();
        try {
            input= obj.collect(args[0]);  //Used the console for inputs to run code
            String s = obj.summarizeCollection(input);
            System.out.println(s);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid or Empty input");
        }

    }
}
