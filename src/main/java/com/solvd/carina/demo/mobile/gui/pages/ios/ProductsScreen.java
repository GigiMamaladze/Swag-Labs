package com.solvd.carina.demo.mobile.gui.pages.ios;

import com.solvd.carina.demo.mobile.gui.pages.common.ProductScreenBase;
import com.solvd.carina.demo.mobile.gui.pages.common.ProductsScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ProductsScreenBase.class)
public class ProductsScreen extends ProductsScreenBase {

    @ExtendedFindBy(iosPredicate = "label == 'Products'")
    private ExtendedWebElement screenTitle;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeOther[$type == 'XCUIElementTypeStaticText' AND label == 'Sauce Lab Back Packs'$][-1]")
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
