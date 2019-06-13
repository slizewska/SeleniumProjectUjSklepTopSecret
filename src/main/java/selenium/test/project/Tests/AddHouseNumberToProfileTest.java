package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.ProfilePage;

public class AddHouseNumberToProfileTest extends AbstractTest {
    @Test
    public void successAddHouseNumberToProfileTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ProfilePage profilePage = dashboardPage.goToProfilePage();
        ProfilePage addStreetNumber = profilePage.addStreetNumber("12");
        profilePage = addStreetNumber.submitProfileForms();
        Assert.assertTrue(profilePage.isHouseNumberDisplayed());
    }
}

