package Predicate;

public class Pirminis implements Predicate {

    @Override
    public boolean test(int number) {
        if (number == 1) return true;
        for(int i = 2; i < number; i++)
            if (number % i == 0) return false;
        return 1 < number;
    }
}
