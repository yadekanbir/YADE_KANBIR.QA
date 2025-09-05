package Pages;

import Utils.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class qualityAssurancePage {
    ElementHelper elementHelper;

    By btn_SeeAllQAJobs = By.cssSelector(".btn.btn-outline-secondary.rounded");

    public qualityAssurancePage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    public void clickSeeAllQAJobs() {
        elementHelper.click(btn_SeeAllQAJobs);
    }
}

