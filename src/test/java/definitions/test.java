package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.TemperatureConventer;


public class test {

            private double inputTemperature;
            private double result;

            @Given("a temperature in Fahrenheit is {double}")
            public void a_temperature_in_fahrenheit_is(Double fahrenheit) {
                inputTemperature = fahrenheit;
            }

            @Given("a temperature in Celsius is {double}")
            public void a_temperature_in_celsius_is(Double celsius) {
                inputTemperature = celsius;
            }

            @When("I convert it to Celsius")
            public void i_convert_it_to_celsius() {
                result = TemperatureConventer.fahrenheitToCelsius(32);
            }

            @When("I convert it to Fahrenheit")
            public void i_convert_it_to_fahrenheit() {
                result = TemperatureConventer.celsiusToFahrenheit(0.0);
            }

            @Then("the result should be {double} Celsius")
            public void the_result_should_be_celsius(Double celsius) {
                assertEquals(celsius, result, 0.01); // Adjust the tolerance as needed
            }

            @Then("the result should be {double} Fahrenheit")
            public void the_result_should_be_fahrenheit(Double fahrenheit) {
                assertEquals(fahrenheit, result, 0.01); // Adjust the tolerance as needed
            }

}
