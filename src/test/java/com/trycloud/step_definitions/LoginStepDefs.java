package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Then("the user is logged in")
    public void the_user_is_logged_in() {

        loginPage.login();
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        System.out.println("Access to login page implemented in Before method");
    }

    @Given("the user logged in using {string}")
    public void the_user_logged_in_using(String submitType) {

        loginPage.login(submitType);
    }


}
