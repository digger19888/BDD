package com.cucumber.junit.pages;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class ProductPage extends BasePage {

    private static final String PAGE_TITLE_PATTERN = "//h2[@class='cloud-headline2'][contains(.,'Compute Engine')]";

    public boolean isPageWithTitleDisplayed(String title) {
        return isElementDisplayed(By.xpath(format(PAGE_TITLE_PATTERN, title)));
    }
}
