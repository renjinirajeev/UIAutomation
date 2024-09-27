package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ItemPage extends BasePage {

    @FindBy(xpath = "//span/b[text()='SELECT SIZE']")
    WebElement itemPage;

    @FindBy(xpath = "//div[@class='row']/following-sibling::a")
    List<WebElement> size;

    @FindBy(xpath = "//div[@class='col s6']/button")
    WebElement addToCartBtn;

    public boolean userInItemPage() {
        return itemPage.isDisplayed();

    }

    public void addToCart() {
        size.get(1).click();
        addToCartBtn.click();

    }
}
