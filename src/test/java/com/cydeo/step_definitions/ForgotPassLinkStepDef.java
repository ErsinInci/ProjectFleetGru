package com.cydeo.step_definitions;

import com.cydeo.pages.ForgotPassword;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ForgotPassLinkStepDef {

    ForgotPassword forgotPassword=new ForgotPassword();

    @When("user clicks Forgot your password?")
    public void user_clicks_forgot_your_password() {

        forgotPassword.fFpassLink.click();
    }
    @Then("User land on the ‘Forgot Password’page")
    public void user_land_on_the_forgot_password_page() {

        forgotPassword.fpassPage.getText();

        String landsOnPage=forgotPassword.fpassPage.getText();

        String expectedResult="Forgot Password";

        Assert.assertEquals(expectedResult,landsOnPage);


    }

}
