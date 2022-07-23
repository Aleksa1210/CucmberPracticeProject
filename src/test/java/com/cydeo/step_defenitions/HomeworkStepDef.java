package com.cydeo.step_defenitions;

import com.cydeo.pages.LoginHomework;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.app.event.implement.IncludeRelativePath;
import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomeworkStepDef {
    LoginHomework loginHomework = new LoginHomework();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();



    @Given("uer is on the Vehicles \\(Cars) page")
    public void uer_is_on_the_vehicles_cars_page() throws InterruptedException {
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");

        loginHomework.login();
        loginHomework.fleet.click();
        loginHomework.vehicles.click();
        Thread.sleep(3000);
        loginHomework.isDisplaCar.isDisplayed();

    }
    @When("user click to Grid Settings burin")
    public void user_click_to_grid_settings_burin() throws InterruptedException {
    loginHomework.gridSettings.click();
    loginHomework.close.click();
    Thread.sleep(300);

    }

    @Then("user should be see Grid Setting of drag and drop")
    public void user_should_be_see_grid_setting_of_drag_and_drop() {
    //Point po = loginHomework.gridSettings.getLocation();
      //  System.out.println(po.x);
        //System.out.println(po.y);
        System.out.println("loginHomework.isGridSettingButtonOfTheVytruckInTheRightPage() = " + loginHomework.isGridSettingButtonOfTheVytruckInTheRightPage());

    }
}
