package com.cydeo.step_definitions;

import com.cydeo.pages.EnterKeyPage;
import com.cydeo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EnterKeyStepDef {

    LoginPage loginPage=new LoginPage();
    EnterKeyPage enterKeyPage=new EnterKeyPage();
    @And("user enters the enter key")
    public void user_enters_the_enter_key() {

       // loginPage.usernameBox.sendKeys("salesmanager101");

        //loginPage.passwordBox.sendKeys("UserUser123"+Keys.ENTER);

       loginPage.submitBtn.sendKeys(Keys.ENTER);
    }
    @Then("user logs in successfully")
    public void user_logs_in_successfully() {

        Assert.assertTrue(enterKeyPage.dashboard.getText().equals("Dashboard"));

       // String expectedResult="Quick Launchpad";
       // String actualResult=enterKeyPage.quickLaunchpad.getText();
        // Assert.assertEquals(expectedResult,actualResult);

    }


    @And("user enter password")
    public void userEnterPassword() {

        loginPage.passwordBox.sendKeys("UserUser123");

    }

    @When("user enter username")
    public void userEnterUsername() {
        loginPage.usernameBox.sendKeys("user1");
    }
}
