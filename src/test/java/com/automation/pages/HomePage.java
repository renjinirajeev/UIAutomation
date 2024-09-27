package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class=\"home page-content\"]")
    WebElement page;

    @FindBy(id="search")
    WebElement searchElement;

    @FindBy(css=".desktop-suggestion")
    List<WebElement>productList;


    public void openWebsite(){
        driver.get(ConfigReader.getConfig("Url"));
    }
    public boolean isHomePageDisplayed(){
        return page.isDisplayed();
    }

    public void searchElement(String product){
        searchElement.sendKeys(product);
        productList.get(0).click();
    }
}


