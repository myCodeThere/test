package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sunrise.SunrisePage;

public class MainConverterPage {
    WebDriver driver;
    public MainConverterPage(WebDriver driver) {
        this.driver = driver;
    }
    public SunrisePage search_form_enter_tomorrow() {
        WebElement searchForm = driver.findElement(By.id("q"));
        searchForm.sendKeys("восход солнца завтра");
        WebElement searchButton = driver.findElement(By.className("go-form__submit"));
        searchButton.click();
        return new SunrisePage(driver);
}
    public ConverterPage search_form_currency_converter() {
    WebElement searchForm = driver.findElement(By.id("q"));
    searchForm.sendKeys("курс валют");
    WebElement searchButton = driver.findElement(By.className("go-form__submit"));
    searchButton.click();
    return new ConverterPage(driver);
}
    public ConverterPage search_form_currency_converter_with_other_request(String str) {
        WebElement searchForm = driver.findElement(By.id("q"));
        //searchForm.sendKeys("курс валют рубль гривна");
        searchForm.sendKeys(str);
        WebElement searchButton = driver.findElement(By.className("go-form__submit"));
        searchButton.click();
        return new ConverterPage(driver);
}

    public SunrisePage search_form_enter_today() {
        WebElement searchForm = driver.findElement(By.id("q"));
        searchForm.sendKeys("восход солнца сегодня");
        WebElement searchButton = driver.findElement(By.className("go-form__submit"));
        searchButton.click();
        return new SunrisePage(driver);
    }
}