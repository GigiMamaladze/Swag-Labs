package com.solvd.carina.demo.mobile.gui.pages.android;

import com.solvd.carina.demo.mobile.gui.pages.common.CartScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartScreenBase.class)
public class CartScreen extends CartScreenBase {

    @FindBy(id = "productTV")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//*[@resource-id = 'com.saucelabs.mydemoapp.android:id/titleTV'][@text = '%s']")
    private ExtendedWebElement productTitle;

    public CartScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isProductPresent(String productName) {
        return productTitle.format(productName).isElementPresent(3);
    }

    @Override
    public boolean isScreenOpened() {
        return screenTitle.isElementPresent(3);
    }
}
