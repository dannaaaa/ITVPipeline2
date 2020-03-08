package com.spartaglobal.ITVPipeline2.StepDefs;

import com.spartaglobal.ITVPipeline2.Pages.Homepage;
import com.spartaglobal.ITVPipeline2.Pages.SignIn;
import com.spartaglobal.ITVPipeline2.SeleniumConfig.SeleniumConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItvLoginStepDefs {
    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "chromedriver.exe");
    private SignIn signInPage;
    private Homepage homepage;

    @Given("I am on the sign in page")
    public void i_am_on_the_sign_in_page() {
        homepage = new Homepage(seleniumConfig.getDriver());
        homepage.goToHomepage();
        homepage.clickCookieButton();
        signInPage = homepage.clickSignInButton();
    }

    @When("I input an invalid email")
    public void i_input_an_invalid_email() {
        signInPage.inputUsername("test@test.com");
    }

    @And("an invalid password")
    public void an_invalid_password() {
        signInPage.inputPassword("itvtest");
    }

    @Then("I receive a valid error")
    public void i_receive_a_valid_error() {
        signInPage.clickSubmitButton();
        assertEquals("Please check your email and password then try again", signInPage.getUsernameAndPasswordErrorText());
    }

    @When("I input a valid email")
    public void iInputAValidEmail() {
        signInPage.inputUsername("spartaglobal@gmail.com");
    }

    @And("a valid password")
    public void aValidPassword() {
        signInPage.inputPassword("password");
    }

    @Then("I will be signed into my ITV account")
    public void iWillBeSignedIntoMyITVAccount() {
        signInPage.clickSubmitButton();
        assertEquals("Sparta", homepage.getUsername());
    }
}
