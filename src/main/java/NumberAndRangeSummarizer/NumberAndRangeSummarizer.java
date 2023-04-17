package NumberAndRangeSummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Integer> newList = new ArrayList<>(input);
        List<String> items = newList.stream().map(n -> new Object() {final int number = n; final int group = newList.indexOf(n);})
                .collect(Collectors.groupingBy(obj -> obj.group)).values().stream()
                .map(g -> g.size() >=3
                        ? g.get(0).number + "-" +g.get(g.size()-1).number
                        : g.stream().map(obj -> String.valueOf(obj.number)).collect(Collectors.joining(", ")))
                .collect(Collectors.toList());
        String summarizedString = String.join(", ", items);
        return summarizedString;
    }
}
