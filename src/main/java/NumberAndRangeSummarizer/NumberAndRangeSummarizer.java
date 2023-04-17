package NumberAndRangeSummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberAndRangeSummarizer implements NumberRangeSummarizer {
    public Collection<Integer> collect(String input)
    {
        List<Integer> numbers = new ArrayList<Integer>();
        try
        {
            if (input == null || input.trim().isEmpty())
            {
                return numbers;
            }

            String[] stringArray = input.split(",");
            for (String s : stringArray)
            {
                numbers.add(Integer.parseInt(s));
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid input string");
        }
        return numbers;
    }


    public String summarizeCollection(Collection<Integer> input)
    {
        if (input.size()==0)
        {
            return "Empty input";
        }
        List<Integer> sortedInput = new ArrayList<>(input);
        Collections.sort(sortedInput);

        List<Range> ranges = new ArrayList<>();
        Range currentRange = null;

        for (Integer num : sortedInput)
        {
            if (currentRange == null || !currentRange.isAdjacent(num))
            {
                currentRange = new Range(num);
                ranges.add(currentRange);
            }
            else
            {
                currentRange.add(num);
            }
        }

        List<String> rangeStrings = new ArrayList<>();
        for (Range range : ranges)
        {
            rangeStrings.add(range.toString());
        }

        return String.join(", ", rangeStrings);
    }


}
