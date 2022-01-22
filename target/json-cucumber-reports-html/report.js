$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Login.feature");
formatter.feature({
  "name": "Pesquisar",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Realizar uma pesquisa",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu acesse a pagina \"http://google.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PesquisaSteps.que_eu_acesse_a_pagina(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "realizar uma consulta por \"Minecraft\"",
  "keyword": "When "
});
formatter.match({
  "location": "PesquisaSteps.realizar_uma_consulta_por(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizar 3 pesquisas relacionadas ao assunto",
  "keyword": "Then "
});
formatter.match({
  "location": "PesquisaSteps.visualizar_pesquisas_relacionadas_ao_assunto(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});