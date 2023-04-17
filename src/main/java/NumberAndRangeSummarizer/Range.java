package NumberAndRangeSummarizer;

public class Range {
    private int start;
    private int end;

    public Range(int start) {
        this.start = start;
        this.end = start;
    }

    public boolean isAdjacent(int num) {
        return num == end + 1;
    }

    public void add(int num) {
        end = num;
    }

    @Override
    public String toString() {
        if (start == end) {
            return Integer.toString(start);
        } else {
            return start + "-" + end;
        }
    }
}
