package com.solvd.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class CartScreenBase extends AbstractMobileScreenBase {

    public CartScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductPresent(String productName);
}
