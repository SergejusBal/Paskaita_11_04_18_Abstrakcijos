package SortText;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortNaturalOrder implements SortText {
    @Override
    public List<String> sort(List<String> list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }
}
