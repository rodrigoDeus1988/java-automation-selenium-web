package core.browsers;

import org.openqa.selenium.WebDriver;

public interface IBrowser {
    public WebDriver getInstance();

    public void setupBrowser();
}
