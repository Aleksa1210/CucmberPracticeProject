package com.cydeo.step_defenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("user is on the library login page");

    }
    @When("user enter librarian username")
    public void user_enter_librarian_username() {
        System.out.println("user enter librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }


    @When("user enter student username")
    public void user_enter_student_username() {
        System.out.println("user enter student username");
    }

    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enters student password");
    }
    @Then("user should be see dashboard")
    public void user_should_be_see_dashboard() {
        System.out.println("user should be see dashboard");
    }



    @When("user enter admin username")
    public void user_enter_admin_username() {
        System.out.println("user enter admin username");
    }

    @When("user enters admin dashboard")
    public void user_enters_admin_dashboard() {
        System.out.println("user enters admin dashboard");
    }







}
