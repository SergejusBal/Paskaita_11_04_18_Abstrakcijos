package StringOperation;

public class StringOperationReverse implements StringOperation {
    @Override
    public String manipulate(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = input.length()-1; i >= 0; i--)            stringBuilder.append(input.charAt(i));
        return stringBuilder.toString();
    }
}
