package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {

    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By allowAllCookies = By.xpath("//button[text()='Allow all cookies']");
    private By inputNumber = By.xpath("//input[@autocomplete='tel']");
    private By inputFullName = By.xpath("//input[@aria-label='Full Name']");
    private By inputUsername = By.xpath("//input[@aria-label='Username']");
    private By inputPassword = By.xpath("//input[@type='password']");

    public void clickCookies(){
        LOG.info("Click the button");
        driver.findElement(allowAllCookies).click();
    }

    public void insertNumber(String number){
        LOG.info("Insert Number Phone");
        driver.findElement(inputNumber).sendKeys(number);
    }

    public void insertFullName(String name){
        LOG.info("Insert full name");
        driver.findElement(inputFullName).sendKeys(name);
    }

    public void insertUsername(String username){
        LOG.info("Insert username");
        driver.findElement(inputUsername).sendKeys(username);
    }

    public void insertPassword(String password){
        LOG.info("Insert password");
        driver.findElement(inputPassword).sendKeys(password);
    }

}
