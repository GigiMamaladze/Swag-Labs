package com.solvd.carina.demo.mobile.gui.pages.android;

import com.solvd.carina.demo.mobile.gui.pages.common.ProductScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductScreenBase.class)
public class ProductScreen extends ProductScreenBase {

    @FindBy(xpath = "//*[@resource-id ='com.saucelabs.mydemoapp.android:id/productTV'][@text = '%s']")
    private ExtendedWebElement productTitle;

    @FindBy(id = "cartBt")
    private ExtendedWebElement addToCartButton;

    public ProductScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductPresent(String productName) {
        return productTitle.format(productName).isElementPresent(3);
    }

    @Override
    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    @Override
    public boolean isScreenOpened() {
        return addToCartButton.isElementPresent(3);
    }
}