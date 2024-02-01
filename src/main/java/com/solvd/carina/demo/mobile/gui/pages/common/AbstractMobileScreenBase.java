package com.solvd.carina.demo.mobile.gui.pages.common;

import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AbstractMobileScreenBase extends AbstractPage implements IMobileUtils {

    public AbstractMobileScreenBase(WebDriver driver) {
        super(driver);
    }

    public boolean isScreenOpened() {
        throw new UnsupportedOperationException("'isScreenOpened' method is not implemented.");
    }
}
