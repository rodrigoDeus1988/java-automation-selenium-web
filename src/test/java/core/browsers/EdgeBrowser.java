package core.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser implements IBrowser {

    /**
     * Setup de browser antes de instanciar.
     */
    public void setupBrowser(){
        WebDriverManager.edgedriver().setup();
        WebDriverManager.edgedriver().getWebDriver();
    }

    public WebDriver getInstance() {
        setupBrowser();
        return (new EdgeDriver());
    }
}
