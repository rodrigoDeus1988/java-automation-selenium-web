package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;

import org.junit.Assert;
import pages.PesquisaPage;

public class PesquisaSteps {

    PesquisaPage pesquisapage = new PesquisaPage();

    @Dado("que eu acesse a pagina {string}")
    public void que_eu_acesse_a_pagina(String url) {
        pesquisapage.ir(url);

    }

    @Quando("realizar uma consulta por {string}")
    public void realizar_uma_consulta_por(String pesquisa) {
        pesquisapage.pesquisar(pesquisa);

    }

    @Entao("visualizar {int} pesquisas relacionadas ao assunto")
    public void visualizar_pesquisas_relacionadas_ao_assunto(Integer int1) {
       // Assert.assertTrue("Erro ao visualizar página com resultados de pesquisa." ,pesquisapage.checkPage());
        pesquisapage.visualizarTresPesquisas();
    }
}
