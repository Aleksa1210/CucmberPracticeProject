package com.cydeo.step_defenitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLoginStedDet {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is in web table login page")
    public void user_is_in_web_table_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
    }
    @When("user enter username {string}")
    public void user_enter_username(String username) {
      //  webTableLoginPage.username.sendKeys("web.app.username"); from Configuration reader/ properties
        webTableLoginPage.username.sendKeys(username); // from Feature

    }
    @When("user enter password {string}")
    public void user_enter_password(String password) {
    //webTableLoginPage.password.sendKeys("web.app.password"); from Configuration reader/ properties
        webTableLoginPage.password.sendKeys(password); // from Feature
    }
    @When("user click login button")
    public void user_click_login_button() {
        webTableLoginPage.loginBtn.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));

    }

    @When("user enter username {string},  password {string} and login")
    public void user_enter_username_password_and_login(String userna, String passwor) {
      webTableLoginPage.login(userna, passwor);
    }

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {
        webTableLoginPage.login(credentials.get("username"), credentials.get("password"));
    }




}
