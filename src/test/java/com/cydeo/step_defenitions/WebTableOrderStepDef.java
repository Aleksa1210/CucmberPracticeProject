package com.cydeo.step_defenitions;

import com.cydeo.pages.AllOrdersPage;
import com.cydeo.pages.BasePage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import java.util.List;

public class WebTableOrderStepDef {
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();
    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();
    AllOrdersPage allOrdersPage = new AllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
        webTableLoginPage.login("Test", "Tester");
        basePage.order.click();

    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {
        Select select = new Select(webTableOrderPage.product);
        select.selectByVisibleText(productType);
    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {
        webTableOrderPage.quantity.clear();
        webTableOrderPage.quantity.sendKeys(String.valueOf(quantity)); //2
        //webTableOrderPage.quantity.sendKeys(quantity + "");  // convert to String 2 (should be INT)
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerName) {
        webTableOrderPage.name.sendKeys(customerName);

    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
    webTableOrderPage.street.sendKeys(street);

    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
    webTableOrderPage.city.sendKeys(city);
    }

    @When("user enters state {string}")
    public void user_enters_state(String state) {
    webTableOrderPage.state.sendKeys(state);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipcode) {
    webTableOrderPage.zip.sendKeys(zipcode);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardType) {
        List<WebElement> cardTypes = webTableOrderPage.cardType;
        for (WebElement each : cardTypes){  // or webTableOrderPage.cardType
            if (each.getAttribute("value").equalsIgnoreCase(cardType)){ // value from page
               each.click();
            }
        }

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNumber) {
    webTableOrderPage.cardNumber.sendKeys(cardNumber);

    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expiryDate) {
    webTableOrderPage.cardExp.sendKeys(expiryDate);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
    webTableOrderPage.processOrder.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String table) {
    allOrdersPage.first.isDisplayed();
        Assert.assertEquals(table, allOrdersPage.first.getText());
    }
}
