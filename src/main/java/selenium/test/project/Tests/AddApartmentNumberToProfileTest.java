package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.DashboardPage;
import selenium.test.project.Pages.ProfilePage;

public class AddApartmentNumberToProfileTest extends AbstractTest {
    @Test
    public void successAddApartmentNumberToProfileTest() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ProfilePage profilePage = dashboardPage.goToProfilePage();
        ProfilePage addApartmentNumber = profilePage.addApartmentNumber("12");
        profilePage = addApartmentNumber.submitProfileForms();
        Assert.assertTrue(profilePage.isApartmentNumberDisplayed());
    }
}