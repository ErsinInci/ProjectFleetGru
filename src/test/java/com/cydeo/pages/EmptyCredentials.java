package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmptyCredentials {

    public EmptyCredentials(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    //String message = Driver.getDriver().findElement(By.name("_username")).getAttribute("validationMessage");



    @FindBy(name ="_username" )

    public WebElement errorMsgFillOut;

}
