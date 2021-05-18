import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YandexTest {
    public static void main(String[] args) {
        /*Первый способ запуска браузера*/
        //System.setProperty("webdriver.chrome.driver", "C:\\auto-demo-tools\\chromedriver.exe");

        /*Второй способ прописать параметры окружения*/
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\PC\\AppData\\Local\\Yandex\\YandexBrowser\\Application\\browser.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://selenium.dev");
        driver.quit();
    }
}
