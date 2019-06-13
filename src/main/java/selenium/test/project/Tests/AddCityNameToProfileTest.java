package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.ProfilePage;

public class AddCityNameToProfileTest extends AbstractTest {
    @Test
    public void successAddCityNameToProfileTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ProfilePage profilePage = dashboardPage.goToProfilePage();
        ProfilePage addZipNumber = profilePage.addZipNumber("Kraków");
        profilePage = addZipNumber.submitProfileForms();
        Assert.assertTrue(profilePage.isZipNumberDisplayed());
    }
}