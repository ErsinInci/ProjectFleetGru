package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterKeyPage {

    public EnterKeyPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "_submit")
    public WebElement submitBtn;

    @FindBy (xpath ="//h1[@ class='oro-subtitle']" )
    public WebElement dashboard;


}
