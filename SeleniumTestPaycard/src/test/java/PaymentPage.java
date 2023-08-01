import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage {
    private WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement inputCardNumber() {
        return driver.findElement(By.id("input-card-number"));
    }

    public WebElement inputCardHolder() {
        return driver.findElement(By.id("input-card-holder"));
    }

    public Select selectExpiresMonth() {
        WebElement cardExpiresMonth = driver.findElement(By.id("card-expires-month"));
        return new Select(cardExpiresMonth);
    }

    public Select selectExpiresYear() {
        WebElement cardExpiresYear = driver.findElement(By.id("card-expires-year"));
        return new Select(cardExpiresYear);
    }

    public WebElement inputCardCvc() {
        return driver.findElement(By.id("input-card-cvc"));
    }

    public WebElement OrderNumber() {
        return driver.findElement(By.id("order-number"));
    }

    public WebElement TotalAmount() {
        return driver.findElement(By.id("total-amount"));
    }

    public WebElement ActionSubmit() {
        return driver.findElement(By.id("action-submit"));
    }

    public WebElement ActionCancel() {
        return driver.findElement(By.id("action-cancel"));
    }

    //доп действия
    public void enterCardNumber(String cardNumber) {
        inputCardNumber().sendKeys(cardNumber);
    }

    public void enterCardHolder(String cardHolder) {
        inputCardHolder().sendKeys(cardHolder);
    }

    public void enterCardCvc(String cvc) {
        inputCardCvc().sendKeys(cvc);
    }

    public void clickActionSubmit() {
        ActionSubmit().click();
    }
}
