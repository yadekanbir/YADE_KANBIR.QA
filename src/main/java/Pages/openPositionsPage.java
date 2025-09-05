package Pages;

import Utils.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class openPositionsPage {
    ElementHelper elementHelper;

    By dropdown_Department = By.id("filter-by-department");
    By dropdown_Location = By.id("filter-by-location");
    By list_Job = By.id("career-position-list");
    By list_Positions = By.cssSelector(".position-title.font-weight-bold");
    By list_Department = By.cssSelector(".position-department.text-large.font-weight-600.text-primary");
    By list_Locations = By.cssSelector(".position-location.text-large");
    By list_ViewRole = By.cssSelector(".btn.btn-navy.rounded.pt-2.pr-5.pb-2.pl-5");

    public openPositionsPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    public  void selectLocation(String location){
        elementHelper.select(dropdown_Location,location);
    }

    public void selectDepartment(String department){
        elementHelper.select(dropdown_Department,department);
    }

    public void checkJobList(){
        Assert.assertTrue(elementHelper.findElement(list_Job).isDisplayed(),"Job List is not displayed!");
    }

    public void checkJobsPosition(String position){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.checkAllElementsText(list_Positions,position);
    }

    public void checkJobsLocation(String location){
        elementHelper.checkAllElementsText(list_Locations,location);
    }

    public void checkJobsDepartment(String department){
        elementHelper.checkAllElementsText(list_Department,department);
    }

    public void clickViewRole(){
        elementHelper.click(list_ViewRole);
    }
}
