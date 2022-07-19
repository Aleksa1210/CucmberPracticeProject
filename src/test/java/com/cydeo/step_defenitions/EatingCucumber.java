package com.cydeo.step_defenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {

    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("It is from Given");
    }
    @When("Eat some cucumbers")
    public void eat_some_cucumbers() {
        System.out.println("It is from When");
    }
    @Then("He will be full")
    public void he_will_be_full() {
        System.out.println("It is from Then");
    }

}
