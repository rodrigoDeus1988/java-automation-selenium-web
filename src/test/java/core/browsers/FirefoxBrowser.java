package core.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser implements IBrowser {

    /**
     * Setup de browser antes de instanciar.
     */
    public void setupBrowser(){
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.firefoxdriver().getWebDriver();
    }

    public WebDriver getInstance() {
        setupBrowser();
        return (new FirefoxDriver());
    }
}
