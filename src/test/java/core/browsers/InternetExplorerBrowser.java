package core.browsers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowser implements IBrowser {

    /**
     * Setup de browser antes de instanciar.
     */
    public void setupBrowser(){
        WebDriverManager.iedriver().setup();
        WebDriverManager.iedriver().getWebDriver();
    }

    public WebDriver getInstance() {
        setupBrowser();
        return (new InternetExplorerDriver());
    }
}
