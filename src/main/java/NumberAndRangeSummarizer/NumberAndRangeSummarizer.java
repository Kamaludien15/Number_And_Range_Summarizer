package NumberAndRangeSummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
//        List<Integer> newList = new ArrayList<>(input);
//        List<String> items = newList.stream().map(n -> new Object() {final int number = n; final int group = newList.indexOf(n);})
//                .collect(Collectors.groupingBy(obj -> obj.group)).values().stream()
//                .map(g -> g.size() >=3
//                        ? g.get(0).number + "-" +g.get(g.size()-1).number
//                        : g.stream().map(obj -> String.valueOf(obj.number)).collect(Collectors.joining(", ")))
//                .collect(Collectors.toList());
//        String summarizedString = String.join(", ", items);
//
        if (input == null || input.isEmpty()) {
            return "";
        }

        List<Integer> sortedList = new ArrayList<>(input);
        Collections.sort(sortedList);

        List<String> summaryList = new ArrayList<>();
        int start = sortedList.get(0);
        int end = start;

        for (int i = 1; i < sortedList.size(); i++) {
            int current = sortedList.get(i);
            if (current == end + 1) {
                end = current;
            } else {
                if (start == end) {
                    summaryList.add(Integer.toString(start));
                } else {
                    summaryList.add(start + "-" + end);
                }
                start = end = current;
            }
        }

        if (start == end) {
            summaryList.add(Integer.toString(start));
        } else {
            summaryList.add(start + "-" + end);
        }

        return String.join(", ", summaryList);
    }

}
