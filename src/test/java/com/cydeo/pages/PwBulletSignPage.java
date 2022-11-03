package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PwBulletSignPage {

    public PwBulletSignPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //WebElement password = driver.findElement(By.id("pwd"));
    //if (password.getAttribute("type") == "password"){
    //    // if it is, do something
    //}else {
    //    // not masked
    //}

    @FindBy(id = "prependedInput2")
    public WebElement pwInputBox;

}
