package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //usernameBox: // input[@id='prependedInput']

    //passwordBox: //input[@id='prependedInput2']

    //submitButton: //button[@id='_submit']

    //Quick Launchpad: //h1[@ class='oro-subtitle']

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (id ="prependedInput")
    public WebElement usernameBox;

    @FindBy (id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy (id = "_submit")
    public WebElement submitBtn;

    @FindBy (xpath ="//h1[@ class='oro-subtitle']" )
    public WebElement quickLaunchpad;

    @FindBy (xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div/h1")
    public WebElement dashboard;



}

