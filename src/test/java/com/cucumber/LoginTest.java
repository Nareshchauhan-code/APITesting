package com.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

    @Before
    void beforeHook(){

        System.out.println("this is Before hook");
    }

    @After
    void afterHook(){

        System.out.println("This is After Hook");
    }

    @BeforeStep
    void beforeStep(){

        System.out.println("This is before Step");

    }

    @AfterStep
    void afterStep(){

        System.out.println("This is after step");
    }

    @Given("User is on Home Page")
    public void user_is_on_home_page() {

        System.out.println("User landed on Homepage");

    }

    @When("User Navigate to LogIn Page")
    public void user_navigate_to_log_in_page() {

        System.out.println("User click on Login page");

    }

    @When("User enters Valid username and Valid Password")
    public void user_enters_user_name_and_password() {

        System.out.println("User has been enter the user_name and Password");
    }


    @Then("Message displayed Login Successfully")
    public void message_displayed_login_successfully() {

        System.out.println("The Login message displayed successfully");

    }


    @When("User LogOut from the Application")
    public void user_log_out_from_the_application() {

        System.out.println("User has been logout");

    }

    @Then("Message displayed LogOut Successfully")
    public void message_displayed_log_out_successfully() {

        System.out.println("User got the got put message successfully");

    }


}
