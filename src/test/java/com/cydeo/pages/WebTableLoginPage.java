package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "username")
    public WebElement username;

    @FindBy (name = "password")
    public WebElement password;

    @FindBy (xpath = "//button[@type= 'submit']")
    public WebElement loginBtn;

    public void login(String userName, String passWord){
        username.sendKeys(userName);
        password.sendKeys(passWord);
        loginBtn.click();

    }








}
