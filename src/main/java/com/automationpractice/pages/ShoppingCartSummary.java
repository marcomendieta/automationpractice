package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class ShoppingCartSummary extends AbstractPage {

    private final static String PRODUCT_CART_AVAIL = "//a[text()='%s']/ancestor::tr/td[@class='cart_avail']/span";
    private final static String PRODUCT_CART_DELETE_BUTTON = "//a[text()='%s']/ancestor::tr/td[@data-title='Delete']";


    @FindBy(css = "#total_price")
    private WebElement totalPrice;

    public void verifyProductIsInStock(String productName) {
        assertEquals("In stock", action.getText(By.xpath(String.format(PRODUCT_CART_AVAIL, productName))));
    }

    public void deleteProductFromList(String productName) {
        action.click(By.xpath(String.format(PRODUCT_CART_DELETE_BUTTON, productName)));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(String.format(PRODUCT_CART_AVAIL, productName))));
    }

    public void verifyProductIsNotPresent(String productName) {
        assertFalse(action.isElementVisible(By.xpath(String.format(PRODUCT_CART_AVAIL, productName))));
    }

    public void verifyTotalAmount(String expectedTotalAmount) {
        assertEquals(expectedTotalAmount, action.getText(totalPrice));
    }
}
