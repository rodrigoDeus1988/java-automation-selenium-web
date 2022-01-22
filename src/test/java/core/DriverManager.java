package core;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;

public class DriverManager extends DriverFactory{

    static int tempoEsperaMili = 1000;

    public static WebDriver getDriver(){
        return DriverFactory.getDriver();
    }

    public static void irPara(String url){
        getDriver().get(url);
    }

    public static void quit(){
        DriverFactory.tearDown();
    }

    public static void waitForElement(By el){
        WebDriverWait wait = new WebDriverWait(getDriver(), tempoEsperaMili);
        wait.until(ExpectedConditions.visibilityOfElementLocated(el));
    }

    public static void scrollToElement(By el){
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(el));
        waitForElement(el);
    }

    public static void takeScreenshot(){
    Allure.addAttachment("Image", new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
    }
    public static void takeScreenshot(String titulo){
        Allure.addAttachment(titulo, new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
    }
}
