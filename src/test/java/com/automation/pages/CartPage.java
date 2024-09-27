package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//div[@class='badge-cart']")
    WebElement cartIcon;

    @FindBy(xpath = "//div[@class='col s8']/a")
    WebElement cartAdded;

    public void userClickCart(){
        cartIcon.click();
    }
    public boolean isAddedToCart(){
        return cartAdded.isDisplayed();
    }

}
