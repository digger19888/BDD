package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.String.format;

public class ProductPage extends BasePage {

    private static final String PAGE_TITLE_PATTERN = "//h2[@class='cloud-headline2'][contains(.,'Compute Engine')]";
    private static final By MENU_ITEM = By.xpath("//div[@class='cloud-body-text__small cloud-jump-menu__item__main']");

    public boolean isPageWithTitleDisplayed(String title) {
        return isElementDisplayed(By.xpath(format(PAGE_TITLE_PATTERN, title)));
    }

    public List<WebElement> getMenuItemTitles() {
        return findElements(MENU_ITEM);
    }

}
