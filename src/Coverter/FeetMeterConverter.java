package Coverter;

public class FeetMeterConverter implements Converter{
    @Override
    public double convert(double input) {
        return input * 0.3048;
    }
}
