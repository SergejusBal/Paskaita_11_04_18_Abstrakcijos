package Coverter;

public class FarenheitCelciusConverter implements Converter{
    @Override
    public double convert(double input) {
        return (input - 32.0) * 5.0 / 9.0;
    }
}
