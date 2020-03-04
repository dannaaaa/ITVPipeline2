package com.spartaglobal.ITVPipeline2.StepDefs;

import com.spartaglobal.ITVPipeline2.ITVSite;
import com.spartaglobal.ITVPipeline2.SeleniumConfig.SeleniumConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ItvLoginStepDefs {
    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "/Users/Sham/Documents/ITVPipeline2/chromedriver");
    private ITVSite itvSite = new ITVSite(seleniumConfig.getDriver());

    //Scenario: I receive a valid error when using an incorrect password and incorrect username

    @Given("I am on the sign in page")
    public void i_am_on_the_sign_in_page() {
        itvSite.itvHomepage();
    }
    @When("I input an invalid email")
    public void i_input_a_valid_email() {
        itvSite.itvSignin().inputUsername("test@test.com");
    }

    @And("an invalid password")
    public void an_invalid_password() {
        itvSite.itvSignin().inputPassword("itvtest");
    }

    @Then("I receive a valid error")
    public void i_receive_a_valid_error() {
        itvSite.itvSignin().clickSubmitButton();
        System.out.println(itvSite.itvSignin().getUsernameAndPasswordErrorText());
    }


}
