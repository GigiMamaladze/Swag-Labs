package com.solvd.carina.demo;

import com.solvd.carina.demo.core.constants.ConfigConstant;
import com.solvd.carina.demo.mobile.gui.pages.common.CartScreenBase;
import com.solvd.carina.demo.mobile.gui.pages.common.LoginBaseScreen;
import com.solvd.carina.demo.mobile.gui.pages.common.ProductScreenBase;
import com.solvd.carina.demo.mobile.gui.pages.common.ProductsScreenBase;
import com.solvd.carina.demo.mobile.gui.pages.common.components.MainMenuBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SwagLabTest implements IAbstractTest {

    private final String productName = "Sauce Lab Back Packs";

    @Test
    public void loginTest() {
        ProductsScreenBase productsScreen = initPage(getDriver(), ProductsScreenBase.class);
        LoginBaseScreen loginScreen = initPage(getDriver(), MainMenuBase.class)
                .getNavigationMenu()
                .openLogInScreen();

        Assert.assertTrue(loginScreen.isScreenOpened(), "Login screen should be not opened !");

        loginScreen.typeUserName(R.TESTDATA.getDecrypted(ConfigConstant.SWAG_LAB_USERNAME));
        loginScreen.typePassword(R.TESTDATA.getDecrypted(ConfigConstant.SWAG_LAB_PASSWORD));
        loginScreen.clickLoginButton();

        Assert.assertTrue(productsScreen.isScreenOpened(),
                "User should be logged in ! (product screen should be opened)");
    }

    @Test
    public void addToCartTest() {
        SoftAssert softAssert = new SoftAssert();

        ProductsScreenBase productsScreen = initPage(getDriver(), ProductsScreenBase.class);
        ProductScreenBase productScreen = productsScreen.openProductPage(productName);

        softAssert.assertTrue(productScreen.isScreenOpened(), "Product screen should be opened !");
        softAssert.assertTrue(productScreen.isProductPresent(productName), "Product name should be present on page !");

        productScreen.clickAddToCartButton();
        CartScreenBase cartScreen = initPage(MainMenuBase.class).openCartPage();

        softAssert.assertTrue(cartScreen.isScreenOpened(), "Cart screen should be opened !");
        softAssert.assertTrue(cartScreen.isProductPresent(productName), "Product should be present in cart !");

        softAssert.assertAll();
    }
}