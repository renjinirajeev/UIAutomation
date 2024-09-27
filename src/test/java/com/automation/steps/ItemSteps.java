package com.automation.steps;

import com.automation.pages.ItemPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ItemSteps {

    ItemPage itemPage = new ItemPage();

    @Then("verify user is on searched first item page")
    public void verify_user_is_on_searched_first_item_page() {
        Assert.assertTrue(itemPage.userInItemPage());
    }

    @When("user click add to cart")
    public void user_click_add_to_cart() {
        itemPage.addToCart();
    }
}
