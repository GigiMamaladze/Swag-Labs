package com.solvd.carina.demo.mobile.gui.pages.android;

import com.solvd.carina.demo.mobile.gui.pages.common.ProductScreenBase;
import com.solvd.carina.demo.mobile.gui.pages.common.ProductsScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsScreenBase.class)
public class ProductsScreen extends ProductsScreenBase {

    @FindBy(id = "productTV")
    private ExtendedWebElement screenTitle;

    @FindBy(xpath = "//*[@text = '%s']/parent::android.view.ViewGroup")
    private ExtendedWebElement productItem;

    public ProductsScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public ProductScreenBase openProductPage(String productName) {
        productItem.format(productName).click();
        return initPage(ProductScreenBase.class);
    }

    @Override
    public boolean isScreenOpened() {
        return screenTitle.isElementPresent(3);
    }
}
