package selenium.tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.RegisterPage2;
import step.definitions.ScreenshotOnFailure;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterTest extends ScreenshotOnFailure {

    private String email = "besjanaalla33@gmail.com";
    LoginPage loginPage;
    MainPage mainPage;
    RegisterPage2 registerPage2;
    private static String password = "Besa1997";

    @Test
    public void registerTest(){
        driver.get ("https://demo.nopcommerce.com/");
        mainPage = new MainPage(driver);
        mainPage.clickOnLoginLink();
        loginPage = new LoginPage(driver);
        loginPage.clickRegisterButton();
        registerPage2 = new RegisterPage2(driver);
        assertEquals(driver.getTitle(), "nopCommerce demo store. Register");
        registerPage2.checkGenderFemale();
        registerPage2.enterGeneralities( "Besjana","Alla", email,password );
        registerPage2.enterDateOfBirth(1,1,89);
        registerPage2.setCompany("Besjana shpk");
        registerPage2.clickRegisterButton();

    }


}
