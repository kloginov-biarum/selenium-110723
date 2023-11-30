import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class HugeForm {
    ChromeDriver driver;

    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/ergrevegvrg/Downloads/chromedriver-mac-arm64-2/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://suninjuly.github.io/huge_form.html");
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void successRegistration() throws InterruptedException {
        List<WebElement> inputFields =
                driver.findElements(By.tagName("input"));
        //enter data to all input fields
        for (WebElement input: inputFields) {
            input.sendKeys("Hello");
        }
        sleep(5000);
    }
}
