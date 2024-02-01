package com.solvd.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class ProductScreenBase extends AbstractMobileScreenBase{

    public ProductScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductPresent(String productName);

    public abstract void clickAddToCartButton();
}
