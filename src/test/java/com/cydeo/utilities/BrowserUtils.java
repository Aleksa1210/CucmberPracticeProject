package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class BrowserUtils {
    //    TC : Create utility method
//   1. Create a new class called BrowserUtils
//   2. Create a method to make Multiple Windows logic re-usable 3. When method is called, it should switch window and verify
//    title.

//    Method info:
//   • Name: switchWindowAndVerify
//   • Return type: void
//   • Arg1: WebDriver
//   • Arg2: String expectedInUrl
//   • Arg3: String expectedTitle

    public static void switchWindowAndVerify(String expectedInUrl, String expectedTitle){
        //Switch window
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles(); // give all open tab/windows

        for (String eachWindow : allWindowsHandles) { // .iter  // go throw every tab
            Driver.getDriver().switchTo().window(eachWindow);   // switch tabs
            System.out.println("driver.getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){ // stop at expected url
                break;
            }
        }
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle)); //assertEqals - should be exactly the same

    }
    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());


    }

    public static void waitForInvisibilityOf (WebElement elements){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(elements));
    }



    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue){
        for (WebElement each : radioButtons) {

            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }
    }



















}
