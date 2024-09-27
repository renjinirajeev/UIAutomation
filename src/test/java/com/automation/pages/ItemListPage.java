package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemListPage extends BasePage{

    @FindBy(xpath = "//h6[text()='FILTERS']")
    WebElement itemPage;

    @FindBy(xpath = "//ul/li//span[@class='price']")
    WebElement firstItem;

    public boolean isItemPageDisplayed(){
        return  itemPage.isDisplayed();
    }
    public void userClickFirstItem(){
        firstItem.click();
    }
}
