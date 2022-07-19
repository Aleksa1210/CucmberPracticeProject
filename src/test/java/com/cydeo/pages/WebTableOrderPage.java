package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends BasePage{


    public WebTableOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "product")
    public WebElement product;

    @FindBy(name = "quantity")
    public WebElement quantity;


    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "street")
    public WebElement street;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "zip")
    public WebElement zip;

    @FindBy(name = "card")
    public List<WebElement> cardType;


    @FindBy(name = "cardNo")
    public WebElement cardNumber;

    @FindBy(name = "cardExp")
    public WebElement cardExp;


    @FindBy (xpath = "//button[.='Process Order']")
    public WebElement processOrder;









}
