import Utils.BaseTest;
import Utils.PageManager;
import org.testng.annotations.Test;

public class InsiderTestCase extends BaseTest {

    PageManager pageManager;

    @Test(description = "Insider Interview",priority = 0)
    public void interviewParallelDemo() {
        pageManager = new PageManager(driver);
        pageManager.getHomePage().checkInsiderLogo();
        pageManager.getHomePage().clickAcceptCookies();
        pageManager.getNavigationBar().clickNavItem("Company");
        pageManager.getNavigationBar().clickNavDropdownSub("Careers");
        pageManager.getCareersPage().checkCareesPage();
        pageManager.getGeneralPage().goToQualityAssuranceCareerPage();
        pageManager.getQualityAssurancePage().clickSeeAllQAJobs();
        pageManager.getOpenPositionsPage().selectDepartment("Quality Assurance");
        /*
            Expected Result = Istanbul, Turkey
            Actual Result: Istanbul, Turkiye
        */
        pageManager.getOpenPositionsPage().selectLocation("Istanbul, Turkey");
        pageManager.getOpenPositionsPage().checkJobList();
        pageManager.getOpenPositionsPage().checkJobsPosition("Quality Assurance");
        pageManager.getOpenPositionsPage().checkJobsDepartment("Quality Assurance");
        pageManager.getOpenPositionsPage().checkJobsLocation("Istanbul, Turkey");
        pageManager.getOpenPositionsPage().clickViewRole();
        pageManager.getLeverFormPage().checkLeverFormPageUrl("https://jobs.lever.co/useinsider");
    }

}
