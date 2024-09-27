package com.automation.test;

import com.automation.utils.DataProviderClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriceCompareTest extends BaseTest{

    @Test(dataProvider = "Product data",dataProviderClass = DataProviderClass.class)
    public void searchElementAndCompare(String product){
        homePage.openWebsite();
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.searchElement(product);
        Assert.assertTrue(priceComparePage.userIsOnSearchedPage());
        Assert.assertTrue(priceComparePage.priceInItemListPage());
    }



}
