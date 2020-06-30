package com.cucumber.junit.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuSteps {
    @When("the user opens Google Cloud website")
    public void opensGoogleCloudWebsite() {
    }

    @When("the user clicks on the {string} section")
    public void clickOnSection(String section) {
    }

    @When("the user clicks on the {string} item")
    public void clicksOnItem(String item) {
    }

    @Then("page with title {string} is displayed")
    public void verifyPageTitlePresence(String pageTitle) {
    }
}
