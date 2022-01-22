package pages;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.lang.management.BufferPoolMXBean;

public class PesquisaPage extends DriverManager {

    //Elementos da página
    By inputPesquisa = By.xpath("//input[@title=\"Pesquisar\"]");
    By resultados = By.xpath("//div[13]");
    By logo = By.xpath("//div[@class=\"logo doodle\"]");

    //Funcionalidades da pagina

    //Função para navegar até a página.
    public void ir(String url){
        DriverManager.irPara(url);
    }

    //Função para pesquisar na página.
    public void pesquisar(String pesquisa){
        waitForElement(inputPesquisa);
        takeScreenshot();
        getDriver().findElement(inputPesquisa).sendKeys(pesquisa);
        takeScreenshot();
        getDriver().findElement(inputPesquisa).sendKeys(Keys.ENTER);
        takeScreenshot();

    }

  //  public boolean checkPage(){
  //      waitForElement(logo);
  //      takeScreenshot();
  //      return getDriver().findElement(logo).isDisplayed();

  //  }


    public void visualizarTresPesquisas() {
        takeScreenshot("Visualizar resultados da página");
        scrollToElement(resultados);
        takeScreenshot();
        getDriver().findElement(resultados).click();
    }
}
