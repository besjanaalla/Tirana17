package selenium.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.testng.annotations.Test;
import pages.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static step.definitions.Hooks.driver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Epic(" Java - Miniproject")
@Feature("nopCommerce Test Scenarios")
@Test

public class LoginTest {

    private  String email="besjanaalla33@gmail.com";
    private static String password="Besa1997";
    MainPage mainPage;
    LoginPage loginPage;
    public void loginTest(){
       driver.get("https:demo.nopcommerce.com/");
        mainPage = new MainPage(driver);
        mainPage.clickOnLoginLink();
        //3.	Login with the credentials created from Test 1
        loginPage = new LoginPage(driver);
        loginPage.login(email, password);
        //4.Verify that login is successful:   -“Welcome to our store text” - is displayed    -Log out - Menu is displayed
        assertEquals(mainPage.getWelcomeMessage(), "Welcome to our store");
        assertTrue(mainPage.isLogoutVisible());
    }
}
