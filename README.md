Framework de automação Web
Comando para executar allure report:

allure serve target/allure-results

mvn clean test

mvn clean test --Dcucumber.options="--tags @smoke