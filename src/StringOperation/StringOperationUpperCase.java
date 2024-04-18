package StringOperation;

public class StringOperationUpperCase implements StringOperation {
    @Override
    public String manipulate(String input) {
        return input.toUpperCase();
    }
}