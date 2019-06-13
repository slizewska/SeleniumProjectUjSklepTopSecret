package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.ProfilePage;

public class AddZipNumberToProfileTest extends AbstractTest {
    @Test
    public void successAddZipNumberToProfileTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ProfilePage profilePage = dashboardPage.goToProfilePage();
        ProfilePage addCityName = profilePage.addCityName("30682");
        profilePage = addCityName.submitProfileForms();
        Assert.assertTrue(profilePage.isCityNamerDisplayed());
    }
}