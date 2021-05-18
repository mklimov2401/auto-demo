import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;

public class ChromeTest {
    public static void main(String[] args) {
        /*Первый способ запуска браузера*/
        //System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");

        /*Второй способ прописать параметры окружения*/
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium.dev");
        driver.quit();
    }
}
