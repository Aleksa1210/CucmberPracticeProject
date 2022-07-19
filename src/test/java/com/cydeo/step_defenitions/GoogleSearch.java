package com.cydeo.step_defenitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.junit.Assert;

import java.util.List;

public class GoogleSearch extends GoogleSearchPage{

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {

        //Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       Driver.getDriver().get("https://www.google.com/");
    }
    @When("User types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("User sees apple – Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {
        Assert.assertEquals("apple - Google Search", Driver.getDriver().getTitle());
    }

    @When("User types {string} in the google search box and clicks enter")
    public void user_types_in_the_Google_search_box_nd_clicks_enter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }

    @Then("User sees {string} is in the google title")
    public void user_sees_is_in_the_Google_title(String expectedTitle) {
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @Then("User should be able to search for following:")
    public void user_should_be_able_to_search_for_following(List<String> searchKeywords) {
        for (String each : searchKeywords){
            googleSearchPage.searchBox.clear();
            googleSearchPage.searchBox.sendKeys(each + Keys.ENTER);
            Assert.assertEquals(each + " - Google Search",Driver.getDriver().getTitle());
        }
    }


    @When("User searches for {string} capital")
    public void user_searches_for_capital(String countryName) {
        googleSearchPage.searchBox.sendKeys("What is capital of " + countryName + Keys.ENTER);
    }

    @Then("User should see {string} in the result")
    public void user_should_see_in_the_result(String capitalCity) {
    googleSearchPage.capital.getText();
    Assert.assertEquals(capitalCity,googleSearchPage.capital.getText());

    }














}
