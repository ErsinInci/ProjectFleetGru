package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.ProfileMenuPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProfileMenuStepDef {


    ProfileMenuPage profileMenuPage=new ProfileMenuPage();
    LoginPage loginPage=new LoginPage();
    @When("user enters  username")
    public void user_enters_username() {

        loginPage.usernameBox.sendKeys("user1");
    }
    @When("user enters  password")
    public void user_enters_password() {

        loginPage.passwordBox.sendKeys("UserUser123");
    }
    @When("user press the enter key")
    public void user_press_the_enter_key() {

        loginPage.submitBtn.click();
    }
    @Then("user should see own username")
    public void user_should_see_own_username() {

        Assert.assertEquals(("user1"),profileMenuPage.userMenu.getText());

    }


    }


