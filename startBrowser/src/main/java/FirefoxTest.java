import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
    public static void main(String[] args) {
        /*Первый способ запуска браузера*/
        //System.setProperty("webdriver.gecko.driver", "C:\\tools\\geckodriver.exe");

        /*Второй способ прописать параметры окружения*/
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium.dev");
        driver.quit();
    }
}
