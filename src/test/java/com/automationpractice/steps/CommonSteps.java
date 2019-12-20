package com.automationpractice.steps;

import com.automationpractice.pages.CardDialog;
import com.automationpractice.pages.Main;
import com.automationpractice.pages.ShoppingCartSummary;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonSteps {

    @Given("I open automation practice")
    public void openAutomationPractice() {
        Main main = new Main();
        main.goToAutomationPractice();
    }

    @Given("I click tab {string}")
    public void iSignInAsUserAnd(String tabNme) {
        Main main = new Main();
        main.clickTab(tabNme);
    }

    @Then("I verify {string} has a discount of {string}")
    public void iVerifyHasADiscountOf(String productName, String pricePercent) {
        Main main = new Main();
        main.verifyPricePercentReduction(productName, pricePercent);
    }

    @And("I hover {string} and click on Add to cart")
    public void iHoverAndClickOn(String productName) {
        Main main = new Main();
        main.hoverProduct(productName);
        main.clickAddToChart(productName);
    }

    @And("I click on Continue shopping")
    public void iClickOnContinueShopping() {
        CardDialog cardDialog = new CardDialog();
        cardDialog.clickContinueShopping();
    }

    @And("I go to the Cart drop down and select Checkout")
    public void iGoToTheCartDropDownAndSelectCheckout() {
        Main main = new Main();
        main.clickCartCheckOutButton();
    }

    @And("I verify {string} is In stock")
    public void iVerifyIsInStock(String productName) {
        ShoppingCartSummary shoppingCartSummary = new ShoppingCartSummary();
        shoppingCartSummary.verifyProductIsInStock(productName);
    }

    @And("I remove {string} from the list")
    public void iRemoveFromTheList(String productName) {
        ShoppingCartSummary shoppingCartSummary = new ShoppingCartSummary();
        shoppingCartSummary.deleteProductFromList(productName);
    }


    @And("I verify {string} is no longer displayed in the table")
    public void iVerifyIsNoLongerDisplayedInTheTable(String productName) {
        ShoppingCartSummary shoppingCartSummary = new ShoppingCartSummary();
        shoppingCartSummary.verifyProductIsNotPresent(productName);
    }

    @And("I verify that the total amount to pay is {string}")
    public void iVerifyThatTheTotalAmountToPayIs(String totalAmount) {
        ShoppingCartSummary shoppingCartSummary = new ShoppingCartSummary();
        shoppingCartSummary.verifyTotalAmount(totalAmount);
    }
}
