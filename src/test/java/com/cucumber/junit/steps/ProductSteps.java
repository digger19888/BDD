package com.cucumber.junit.steps;

import com.cucumber.junit.pages.ProductPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductSteps {

    private ProductPage productPage = new ProductPage();

    @Then("there are {int} items in the left-side menu")
    public void verifyLeftMenuSize(int expectedSize) {
        assertThat(productPage.getMenuItemTitles())
                .as("The left-size menu size is not as expected")
                .hasSize(expectedSize);
    }

    @Then("left-side menu contain the following links")
    public void verifyLeftSideMenuContainFollowingLinks(List<String> expectedTitles) {
        assertThat(productPage.getMenuItemTitles())
                .extracting(WebElement::getText)
                .as("Some of the left-side menu items are not as expected")
                .containsAll(expectedTitles);
    }
}
