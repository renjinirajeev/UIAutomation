package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PriceComparePage extends BasePage {

    @FindBy(xpath = "//li[@class='collection-header' and text()='Categories']")
    WebElement itemPage;

    @FindBy(xpath = "//span[@class='price']")
    List<WebElement> priceList;

    @FindBy(xpath = "//div[@class='product-list']/ul/li")
    WebElement firstElement;

    @FindBy(xpath = "//span[@class='price']/span")
    WebElement priceOfAProduct;


    public boolean userIsOnSearchedPage() {
        return itemPage.isDisplayed();
    }

    public boolean priceInItemListPage() {
        boolean flag = false;
        String priceInListPage = priceList.get(0).getText().split("\\₹")[1];
        firstElement.click();
        String priceOfProduct = priceOfAProduct.getText();
        if (priceOfProduct.equals(priceInListPage)) {
            flag = true;
        }
        System.out.println(priceInListPage);
        System.out.println(priceOfProduct);
        return flag;
    }

}
