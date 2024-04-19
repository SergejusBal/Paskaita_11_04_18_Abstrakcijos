package SortInteger;

import java.util.Comparator;
import java.util.List;

public class SortIntegerReverseOrder implements SortInteger {
    @Override
    public List<Integer> sort(List<Integer> list) {
        list.sort(Comparator.reverseOrder());
        return list;
    }
}
