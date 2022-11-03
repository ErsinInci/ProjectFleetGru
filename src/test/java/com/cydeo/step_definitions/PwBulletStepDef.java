package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.PwBulletSignPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class PwBulletStepDef {

    LoginPage loginPage = new LoginPage();

    PwBulletSignPage pwBulletSignPage = new PwBulletSignPage();

    @When("user enters password")
    public void user_enters_password() {

        loginPage.passwordBox.sendKeys("UserUser123");

    }

    @Then("the password is in bullet sign")
    public void the_password_is_in_bullet_sign() {

        //Assert.assertTrue(loginPage.passwordInput.getAttribute("type").equals("password"));

        Assert.assertTrue(pwBulletSignPage.pwInputBox.getAttribute("type").equals("password"));

       /*
        String pw="UserUser123";

        System.out.println(pwBulletSignPage.pwInputBox.getAttribute("type"));

        if (pw.equals(pwBulletSignPage.pwInputBox.getAttribute("type"))){
            System.out.println("The password is in bullet sign(masked)");
        }else {
            System.out.println("not masked");
        }

    }


        */
    }
}