package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testCelsiusToFahrenheitByHillary() 
    {
        double celsius = 0.0; // Test input
        double expectedFahrenheit = 32.0; // Expected result

        double actualFahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);

        // Assert
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001);
    }

    @Test
    public void testFahrenheitToCelsiusByHillary() {
        // Arrange
        double fahrenheit = 32.0; // Test input
        double expectedCelsius = 0.0; // Expected result

        // Act
        double actualCelsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assertEquals(expectedCelsius, actualCelsius, 0.001);
    }


}
