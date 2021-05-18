import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerTest {
    public static void main(String[] args) {
        /*Первый способ запуска браузера*/
        //System.setProperty("webdriver.ie.driver", "C:\\tools\\IEDriverServer.exe");

        /*Второй способ прописать параметры окружения*/
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium.dev");
        driver.quit();
    }
}
