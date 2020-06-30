package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.String.format;

public class HomePage extends BasePage {

    private static final String CLOUD_URL = "https://cloud.google.com/";
//    private static final String TEXT_PATTERN = "%s[contains(@href,'%s')]";
    private static final String MENU_SECTION = "/html/body/section/devsite-header/div/div[1]/div/div/div[2]/div[1]/cloudx-tabs-nav/div/tab[3]/a[1]";
    private static final String CHILD_MENU_ITEM = "(//div[@class='devsite-nav-item-title'][contains(.,'Compute Engine')])[1]";

    public void openCucumberWebsite() {
        DriverManager.getDriver().get(CLOUD_URL);
    }

    public WebElement menuSection(String linkText) {
        return findElement(By.xpath(format( MENU_SECTION, linkText)));
    }

    public WebElement menuChildItem(String linkText) {
        return findElement(By.xpath(format( CHILD_MENU_ITEM, linkText)));
    }
}
