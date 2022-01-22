package core.browsers;
import core.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements IBrowser {

    /**
     * Setup de browser antes de instanciar.
     */
    public void setupBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().getWebDriver();
    }

    public WebDriver getInstance() {
        setupBrowser();
        return (new ChromeDriver());
    }
}
