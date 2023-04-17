package NumberAndRangeSummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NumberAndRangeSummarizer implements NumberRangeSummarizer{
    public Collection<Integer> collect(String input)
    {
        List<Integer> numbers = new ArrayList<Integer>();
        String[] stringArray = input.split(",");

        for (String s: stringArray){
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }

    public String summarizeCollection(Collection<Integer> input)
    {
        return null;
    }
}
