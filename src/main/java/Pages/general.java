package Pages;

import Utils.ElementHelper;
import org.openqa.selenium.WebDriver;

public class general {
    ElementHelper elementHelper;

    public general(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    public void goToQualityAssuranceCareerPage(){
        elementHelper.goToURL("https://useinsider.com/careers/quality-assurance/");
    }
    public void goToHomePage(){
        elementHelper.goToURL("https://useinsider.com/");
    }
}
