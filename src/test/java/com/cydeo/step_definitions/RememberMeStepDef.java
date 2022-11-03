package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.RememberMeLink;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class RememberMeStepDef {

    RememberMeLink rememberMeLink=new RememberMeLink();

    LoginPage loginPage=new LoginPage();

    @When("user clicks Remember me link")
    public void user_clicks_remember_me_link() {
        loginPage.usernameBox.sendKeys("user1");
        loginPage.passwordBox.sendKeys("UserUser123");



    }
    @Then("the link is clickable")
    public void the_link_is_clickable() {

        rememberMeLink.rememberMe.click();

    }



}
