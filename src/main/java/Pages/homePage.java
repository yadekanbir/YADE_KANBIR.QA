package Pages;

import Utils.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class homePage {
    ElementHelper elementHelper;

    By insiderLogo = By.cssSelector("#navigation>div:nth-child(2)>a>img");
    By btn_acceptCookies = By.cssSelector(".cli-bar-btn_container #wt-cli-accept-all-btn");

    public homePage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    public void checkInsiderLogo() {
        Assert.assertTrue(elementHelper.findElement(insiderLogo).isDisplayed(),"Logo is not displayed!");
    }

    public void clickAcceptCookies() {
        elementHelper.click(btn_acceptCookies);
    }
}
