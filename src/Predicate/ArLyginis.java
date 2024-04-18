package Predicate;

public class ArLyginis implements Predicate{
    @Override
    public boolean test(int number) {
        return number%2 == 0;
    }
}
