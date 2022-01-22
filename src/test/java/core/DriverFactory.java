package core;

import core.browsers.ChromeBrowser;
import core.browsers.EdgeBrowser;
import core.browsers.FirefoxBrowser;
import core.browsers.InternetExplorerBrowser;
import org.openqa.selenium.WebDriver;

/***
 * Descrição: Classe para instanciar um driver utilizando variaveis de ambiente.
 */

public class DriverFactory{

    private static WebDriver _driver;

    /***
     *
     * @param browser variavel utilizada escolher o browser definido no pom.xml
     * @return retorna um WebDriver para gerenciamento
     */
    public static WebDriver getDriver(){
        String browser = System.getProperty("browser");

        if(_driver == null){
            switch (browser){
                case "chrome":
                    _driver = new ChromeBrowser().getInstance();
                    break;
                case "firefox":
                    _driver = new FirefoxBrowser().getInstance();
                    break;
                case "edge":
                    _driver = new EdgeBrowser().getInstance();
                    break;
                case "ie":
                    _driver = new InternetExplorerBrowser().getInstance();
                    break;

            }
        }
        return _driver;
    }

    public static void tearDown(){
        _driver.close();
        _driver.quit();
    }



}
