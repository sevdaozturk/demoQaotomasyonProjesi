package stepdefs;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class StepImplementation {

    WebDriver driver = DriverFactory.getDriver();

    @Step("'<url>' adresine gidilir")
    public void navigateTo(String url) {
        driver.get(url);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
    }

    @Step("'<name>' adı girilir")
    public void enterFirstName(String name) {
        driver.findElement(By.id("firstName")).sendKeys(name);
    }

    @Step("'<surname>' soyadı girilir")
    public void enterLastName(String surname) {
        driver.findElement(By.id("lastName")).sendKeys(surname);
    }

    @Step("'<email>' e-posta girilir")
    public void enterEmail(String email) {
        driver.findElement(By.id("userEmail")).sendKeys(email);
    }

    @Step("Cinsiyet olarak '<gender>' seçilir")
    public void selectGender(String gender) {
        WebElement radioBtn = driver.findElement(By.xpath("//label[text()='" + gender + "']"));
        radioBtn.click();
    }

    @Step("'<phone>' telefon numarası girilir")
    public void enterPhone(String phone) {
        driver.findElement(By.id("userNumber")).sendKeys(phone);
    }

    @Step("Submit butonuna tıklanır")
    public void clickSubmit() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);
    }

    @Step("E-posta hata mesajı kontrol edilir")
    public void checkEmailError() {
        WebElement emailField = driver.findElement(By.id("userEmail"));
        assert emailField.getAttribute("class").contains("field-error");
    }

    @Step("Başarı popup'ı kontrol edilir")
    public void checkSuccessPopup() {
        WebElement modal = driver.findElement(By.id("example-modal-sizes-title-lg"));
        assert modal.isDisplayed();
    }

    // Kullanılmayan step'ler — istersen silebilirsin
    @Step("<Kaya> soyadı girilir")
    public void implementation3(Object arg0) {}

    @Step("<ahmet@> e-posta girilir")
    public void implementation2(Object arg0) {}

    @Step("<https://demoqa.com/automation-practice-form> adresine gidilir")
    public void implementation1(Object arg0) {}

    @Step("Cinsiyet olarak <Male> seçilir")
    public void implementation4(Object arg0) {}

    @Step("<5311234567> telefon numarası girilir")
    public void implementation5(Object arg0) {}

    @Step("<Mehmet> adı girilir")
    public void implementation6(Object arg0) {}
}
