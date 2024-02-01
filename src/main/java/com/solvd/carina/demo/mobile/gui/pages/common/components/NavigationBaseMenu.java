package com.solvd.carina.demo.mobile.gui.pages.common.components;

import com.solvd.carina.demo.mobile.gui.pages.common.AbstractMobileScreenBase;
import com.solvd.carina.demo.mobile.gui.pages.common.LoginBaseScreen;
import org.openqa.selenium.WebDriver;

public abstract class NavigationBaseMenu extends AbstractMobileScreenBase {

    public NavigationBaseMenu(WebDriver driver) {
        super(driver);
    }

    public abstract LoginBaseScreen openLogInScreen();
}
