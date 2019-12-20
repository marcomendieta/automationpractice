package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.Assert.assertEquals;

public class Main extends AbstractPage {

    private final static String TAB_NAME = "//a[@data-toggle='tab' and text()='%s']";
    private final static String PRICE_PERCENT_REDUCTION = "//ul[@id='blockbestsellers']//a[@class='product-name' and @title='%s']/ancestor::div[@class='right-block']/div[@class='content_price']/span[@class='price-percent-reduction']";
    private final static String PRODUCT_NAME_TITLE = "//ul[@id='blockbestsellers']//a[@class='product-name' and @title='%s']";
    private final static String ADD_CHART_BUTTON = "//ul[@id='blockbestsellers']//a[@title='%s']/ancestor::div[@class='right-block']//a[@title='Add to cart']";

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//div[@class='cart_block block exclusive']//a[@title='Check out']")
    private WebElement shoppingCartCheckOutButton;

    public void goToAutomationPractice() {
        driver.get("http://automationpractice.com/index.php");
    }

    public void clickTab(String tabNme) {
        action.click(By.xpath(String.format(TAB_NAME, tabNme)));
    }

    public void verifyPricePercentReduction(String productName, String pricePercent) {
        assertEquals(pricePercent,action.getText(By.xpath(String.format(PRICE_PERCENT_REDUCTION, productName))));
    }

    public void hoverProduct(String productName) {
        action.scroll(By.xpath(String.format(PRODUCT_NAME_TITLE, productName)));
        action.hover(By.xpath(String.format(PRODUCT_NAME_TITLE, productName)));
    }

    public CardDialog clickAddToChart(String productName) {
        action.click(By.xpath(String.format(ADD_CHART_BUTTON, productName)));
        return new CardDialog();
    }

    public void hoverCart(String productName) {
        action.scroll(shoppingCartButton);
        action.hover(shoppingCartButton);
    }

    public ShoppingCartSummary clickCartCheckOutButton() {
        action.scroll(shoppingCartButton);
        action.hover(shoppingCartButton);
        action.click(shoppingCartCheckOutButton);
        return new ShoppingCartSummary();
    }



}
