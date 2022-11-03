package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

   public ForgotPassword () {

      PageFactory.initElements(Driver.getDriver(), this);

   }

   @FindBy(xpath = "//a[.='Forgot your password?']")

   public WebElement fFpassLink;


   @FindBy(xpath = "//h2[.='Forgot Password']")

   public WebElement fpassPage;
}


