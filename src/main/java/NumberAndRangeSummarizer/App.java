package NumberAndRangeSummarizer;

import java.util.Collection;

public class App
{
    public static void main( String[] args )
    {
        NumberAndRangeSummarizer obj = new NumberAndRangeSummarizer();
        Collection<Integer> input = obj.collect(args[0]);
        System.out.println(input);
        String s = obj.summarizeCollection(input);
        System.out.println(s);

    }
}
