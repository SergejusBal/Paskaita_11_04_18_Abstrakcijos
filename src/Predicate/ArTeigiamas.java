package Predicate;

public class ArTeigiamas implements Predicate{
    @Override
    public boolean test(int number) {
        return number > 0;
    }
}

