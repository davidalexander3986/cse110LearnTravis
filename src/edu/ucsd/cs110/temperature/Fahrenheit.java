package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Celsius toReturn = new Celsius(this.value);
        toReturn.value = (toReturn.value - 32) * (5/9);
        return toReturn;
    }

    @Override
    public Temperature toFahrenheit() {
        return null;
    }

    public String toString()
    {
        // TODO: Complete this method
        return "";
    }
}
