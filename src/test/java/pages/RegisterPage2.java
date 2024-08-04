package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage2 {
    WebDriver driver;
    @FindBy (id ="FirstName")
    WebElement firstName;
    @FindBy (id = "LastName")
    WebElement lastName;
    @FindBy (id = "gender-female")
    WebElement genderFemale;
    @FindBy (id = "gender-male")
    WebElement genderMale;
    @FindBy (name = "DateOfBirthDay")
    WebElement dateOfBirth;
    @FindBy (name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;
    @FindBy (name = "DateOfBirthYear")
    WebElement dateOfBirthYear;
    @FindBy (name = "Email")
    WebElement email;
    @FindBy (id = "Password")
    WebElement password;
    @FindBy (id="Company")
    WebElement company;
    @FindBy(id="ConfirmPassword")
    WebElement confirmPassword;
    @FindBy(id = "register-button")
    WebElement registerButton;

    Select YearOfBirthSelect;
    Select MonthOfBirthSelect;
    Select DayOfBirthSelect;

    public RegisterPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        YearOfBirthSelect = new Select(dateOfBirthYear);
        MonthOfBirthSelect = new Select(dateOfBirthMonth);
        DayOfBirthSelect = new Select(dateOfBirth);
    }
    public void enterDateOfBirth(Integer day, Integer month, Integer year){
        DayOfBirthSelect.selectByIndex(day+5);
        MonthOfBirthSelect.selectByIndex(month+5);
        YearOfBirthSelect.selectByIndex(year+4);
    }
    public void enterGeneralities ( String firstName, String lastName, String email, String password ) {
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(password);
}

     public void checkGenderFemale(){
        this.genderFemale.click();
    }
    public void checkGenderMale(){
        this.genderMale.click();
    }
    public void setCompany(String company){
        this.company.sendKeys(company);
    }
    public void clickRegisterButton(){
        this.registerButton.click();
    }

}
