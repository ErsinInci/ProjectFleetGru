package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidCredentials {

    //invalid error msg=//div[.='Invalid user name or password.']

    public InvalidCredentials(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//div[.='Invalid user name or password.']")
    public WebElement errorMsg;
}
