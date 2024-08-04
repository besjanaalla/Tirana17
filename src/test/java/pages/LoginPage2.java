package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
    WebDriver driver;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(className = "password")
    WebElement password;
    @FindBy(css = "button-1 login button")
    WebElement loginButton;

    public LoginPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickRegisterButton() {
        loginButton.click();
    }

    public void login(String username, String password) {
        this.email.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }
}
