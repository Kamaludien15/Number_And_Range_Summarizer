package NumberAndRangeSummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NumberAndRangeSummarizer implements NumberRangeSummarizer {
    public Collection<Integer> collect(String input) {
        List<Integer> numbers = new ArrayList<Integer>();
        try {


            if (input == null || input.trim().isEmpty()) {
                return numbers;
            }

            String[] stringArray = input.split(",");
            for (String s : stringArray) {
                numbers.add(Integer.parseInt(s));
            }

        }
        catch (NumberFormatException e){
            System.out.println("Invalid input string");
        }
        return numbers;
    }

    public String summarizeCollection(Collection<Integer> input) {
        return "Hello";
    }
}
