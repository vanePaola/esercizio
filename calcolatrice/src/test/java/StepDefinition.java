import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepDefinition {

    private Calculator c;

    @Given("I have a Calculator")
    public void i_have_a_calculator(){
        c = new Calculator();

    }

    @When("I add {int} and {int}")
    public void when_i_add_two_numbers(int x, int y) {
        c.sum(x,y);

    }

    @Then("the result should be {int}")
    public void the_sum_should_be(Integer int1) {
        assertTrue(c.getResult() == int1);
        throw new io.cucumber.java.PendingException();
    }


}
