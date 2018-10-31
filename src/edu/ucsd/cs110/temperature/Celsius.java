package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit toReturn = new Fahrenheit(this.value);
        toReturn.value = (toReturn.value * 9/5) + 32;
        return toReturn;
    }

    public String toString()
    {
        return String.valueOf(this.getValue()) + " C";
    }
}
