package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.String.format;

public class HomePage extends BasePage {

    private static final String CLOUD_URL = "https://cloud.google.com/";
    private static final String TEXT_PATTERN = "%s[contains(@href,'%s')]";
    private static final String MENU_SECTION = "//*[contains(@class,'gc-analytics-even')]";
    private static final String CHILD_MENU_ITEM = "(//div[@class='devsite-nav-item-title'][contains(.,'Compute Engine')])[1]";

    public void openCucumberWebsite() {
        DriverManager.getDriver().get(CLOUD_URL);
    }

    public WebElement menuSection(String linkText) {
        return findElement(By.xpath(format(TEXT_PATTERN, MENU_SECTION, linkText)));
    }

    public WebElement menuChildItem(String linkText) {
        return findElement(By.xpath(format(TEXT_PATTERN, MENU_SECTION, linkText)));
    }
}
