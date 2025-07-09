package pages;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement firstNameField() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement lastNameField() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement emailField() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement genderRadio(String gender) {
        return driver.findElement(By.xpath("//label[text()='" + gender + "']"));
    }

    public WebElement phoneField() {
        return driver.findElement(By.id("userNumber"));
    }

    public WebElement submitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement successModal() {
        return driver.findElement(By.id("example-modal-sizes-title-lg"));
    }

    @Step("Başarı popup'ı görünmemeli, validasyon kontrol edilir")
    public void implementation1() {

    }

    @Step("Telefon alanı hata mesajı kontrol edilir")
    public void implementation2() {

    }

    @Step("Ad alanı hata mesajı (veya engelleme) kontrol edilir")
    public void implementation3() {

    }
}
