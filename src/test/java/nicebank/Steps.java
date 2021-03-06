package nicebank;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Steps {

    class Account{
        private int balance;

        public void deposit(int amount){
            balance += amount;
        }

        public int getBalance(){
            return balance;
        }
    }


    @Given("^I have deposited \\$(\\d+)\\.(\\d+) in my account$")
    public void i_have_deposited_$_in_my_account(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @When("^I request \\$(\\d+)$")
    public void i_request_$(int amount) throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed(int amount) throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
