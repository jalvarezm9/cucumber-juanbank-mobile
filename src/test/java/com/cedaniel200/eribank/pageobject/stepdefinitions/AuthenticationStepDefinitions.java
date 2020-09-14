package com.cedaniel200.eribank.pageobject.stepdefinitions;

import com.cedaniel200.eribank.pageobject.steps.AUser;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AuthenticationStepDefinitions {

    @Steps
    AUser daneil;

    @When("^I login with username (.*) and password (.*)$")
    public void iLogin(String username, String password) throws Throwable {
        daneil.tryToLogin(username, password);
    }

    @Then("^you should see the home page$")
    public void youShouldSeeTheHome() throws Throwable {
        daneil.shouldSeeHomePage();
    }

    @When("^inicio sesi�n con nombre de usuario (.*) y contrase�a (.*)$")
    public void aLogin(String username, String password){
        daneil.tryToLogin(username, password);
    }

    @Then("^deber�as ver la p�gina de inicio$")
    public void youaShouldSeeTheHome(){
        daneil.shouldSeeHomePage();
    }

}
