package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileMenuPage {

    public ProfileMenuPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
  //  @FindBy(xpath = "//*[@id='user-menu']/a/text()[1]")

    //public WebElement userMenu;



   // @FindBy(xpath = "//*[@id=\"user-menu\"]/a/text()")
    //public WebElement profilMenu;

    @FindBy(id = "user-menu")
    public WebElement userMenu;
}





