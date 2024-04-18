package StringOperation;

public class StringOperationLowerCase implements StringOperation {
    @Override
    public String manipulate(String input) {
        return input.toLowerCase();
    }
}