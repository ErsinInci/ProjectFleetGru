package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginPageStepDef {

    LoginPage loginPage=new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.getDriver().get("https://app.fleetgru.com/user/login");


    }
    @When("The user logs in as a driver")
    public void the_user_logs_in_as_a_driver() {

        loginPage.usernameBox.sendKeys("user1");
        loginPage.passwordBox.sendKeys("UserUser123");

        loginPage.submitBtn.click();


    }
    @Then("The user is on the Quick Launchpad page")
    public void the_user_is_on_the_quick_launchpad_page() {

        loginPage.quickLaunchpad.getText();

       // String expectedResult="Quick Launchpad";
        //String actualResult=loginPage.quickLaunchpad.getText();

       // Assert.assertEquals(expectedResult,actualResult);

    }

    @When("The user logs in as a sales manager")
    public void the_user_logs_in_as_a_sales_manager() {

        loginPage.usernameBox.sendKeys("salesmanager101");
        loginPage.passwordBox.sendKeys("UserUser123");

        loginPage.submitBtn.click();
    }
    @Then("The user is on the Dashboard page")
    public void the_user_is_on_the_dashboard_page() {
        loginPage.dashboard.getText();
    }

    @When("The user logs in as a store manager")
    public void the_user_logs_in_as_a_store_manager() {
        loginPage.usernameBox.sendKeys("storemanager51");
        loginPage.passwordBox.sendKeys("UserUser123");

        loginPage.submitBtn.click();
    }
    @Then("The user is on the Dashboard")
    public void the_user_is_on_the_dashboard() {
        loginPage.dashboard.getText();
    }



}
