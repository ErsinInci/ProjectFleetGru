package com.cydeo.step_definitions;

import com.cydeo.pages.EmptyCredentials;
import com.cydeo.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmptyStepDef {

    EmptyCredentials emptyCredentials=new EmptyCredentials();
    LoginPage loginPage=new LoginPage();

    @When("user leaves username empty")
    public void user_leaves_username_empty() {
        loginPage.usernameBox.sendKeys("");
        loginPage.passwordBox.sendKeys("");

        loginPage.submitBtn.click();
    }
    @Then("user sees Please fill out this field message")
    public void user_sees_please_fill_out_this_field_message() {

        String validationMessage="Lütfen bu alanı doldurun.";

        emptyCredentials.errorMsgFillOut.getAttribute("validationMessage");

    }

}
