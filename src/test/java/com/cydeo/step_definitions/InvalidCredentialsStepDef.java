package com.cydeo.step_definitions;

import com.cydeo.pages.InvalidCredentials;
import com.cydeo.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidCredentialsStepDef {

    InvalidCredentials invalidCredentials=new InvalidCredentials();
    LoginPage loginPage=new LoginPage();
    @When("user enters valid username and invalid password")
    public void user_enters_valid_username_and_invalid_password() {
        loginPage.usernameBox.sendKeys("storemanager51");
        loginPage.passwordBox.sendKeys("123");

        loginPage.submitBtn.click();
    }
    @Then("user sees Invalid username or password")
    public void user_sees_invalid_username_or_password() {

        invalidCredentials.errorMsg.getText();
    }

    @When("the user enters valid password and invalid username")
    public void the_user_enters_valid_password_and_invalid_username() {
        loginPage.usernameBox.sendKeys("abc");
        loginPage.passwordBox.sendKeys("UserUser123");

        loginPage.submitBtn.click();
    }
    @Then("the user sees Invalid username or password")
    public void the_user_sees_invalid_username_or_password() {
        invalidCredentials.errorMsg.getText();
    }


}
