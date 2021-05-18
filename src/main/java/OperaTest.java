import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaTest {
    public static void main(String[] args) {

        /**
         * Браузер не запускается https://github.com/operasoftware/operachromiumdriver/issues/83
         */
        /*Первый способ запуска браузера*/
        //System.setProperty("webdriver.opera.driver", "C:\\auto-demo-tools\\operadriver32.exe");

        //ChromeOptions options = new ChromeOptions();
        OperaOptions options = new OperaOptions();
        options.setBinary("C:\\Users\\PC\\AppData\\Local\\Programs\\Opera\\launcher.exe");
        WebDriver driver = new OperaDriver(options);
        driver.manage().window().maximize();
        driver.get("http://selenium2.ru/");
        driver.quit();
    }
}
