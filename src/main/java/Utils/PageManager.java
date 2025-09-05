package Utils;

import Pages.*;
import org.openqa.selenium.WebDriver;

public class PageManager {

    private WebDriver driver;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public careersPage getCareersPage() {
        return new careersPage(driver);
    }

    public homePage getHomePage() {
        return new homePage(driver);
    }

    public leverFormPage getLeverFormPage() {
        return new leverFormPage(driver);
    }

    public navigationBar getNavigationBar() {
        return new navigationBar(driver);
    }

    public openPositionsPage getOpenPositionsPage() {
        return new openPositionsPage(driver);
    }

    public qualityAssurancePage getQualityAssurancePage() {
        return new qualityAssurancePage(driver);
    }

    public general getGeneralPage() {
        return new general(driver);
    }
}
