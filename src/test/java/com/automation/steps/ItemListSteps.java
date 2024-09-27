package com.automation.steps;

import com.automation.pages.ItemListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ItemListSteps {

    ItemListPage itemListPage=new ItemListPage();

    @Then("verify user is on searched element page")
    public void verify_user_is_on_searched_element_page() {
        Assert.assertTrue(itemListPage.isItemPageDisplayed());
    }

    @When("user click an the first item")
    public void user_click_an_the_first_item() {
        itemListPage.userClickFirstItem();

    }



}
