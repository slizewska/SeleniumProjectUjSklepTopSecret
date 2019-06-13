package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.ProfilePage;

public class AddStreetNameToProfileTest extends AbstractTest {
    @Test
    public void successAddStreetNumberToProfileTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ProfilePage profilePage = dashboardPage.goToProfilePage();
        ProfilePage addHouseNumber = profilePage.addHouseNumber("12");
        profilePage = addHouseNumber.submitProfileForms();
        Assert.assertTrue(profilePage.isStreetNumberDisplayed());
    }
}



