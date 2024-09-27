package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("user opens the website")
    public void user_opens_the_website() {
       homePage.openWebsite();
    }

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("user search an element {string}")
    public void user_search_an_element(String product) {
       homePage.searchElement(ConfigReader.getConfig("product.name"));
    }




}
