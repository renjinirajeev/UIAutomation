package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartSteps {

    CartPage cartPage = new CartPage();
    @Then("verify user added the product successfully")
    public void verify_user_added_the_product_successfully() {
        cartPage.userClickCart();
        Assert.assertTrue(cartPage.isAddedToCart());
    }
}
