package definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RomanTest {

    private int input;
    private String result;

    @Given("the RomanConverter is available")
    public void the_roman_converter_is_available() {
        // You can set up any necessary initialization here if needed
    }

    @When("I convert {int} to Roman numeral")
    public void i_convert_to_roman_numeral(int num) {
        this.input = num;
        this.result = RomanConverter.convertToRoman(num);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expectedRomanNumeral) {
        assertEquals(expectedRomanNumeral, result);
    }

    }


