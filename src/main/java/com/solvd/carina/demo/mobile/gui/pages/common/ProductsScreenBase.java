package com.solvd.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class ProductsScreenBase extends AbstractMobileScreenBase {

    public ProductsScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract ProductScreenBase openProductPage(String productName);
}
