package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    WebDriver driver;

    String btnRegistrar = "//*[contains(text(),'Registrar')]"; //cliacar
    String email = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/input[1]"; // Preenche3r
    String nome = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/input[1]"; //Nome
    String senha = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]";  // Confirmação
    String confirmarSenha = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/input[1]";  // Confirmação
    String criarComSaldo = "//label[@id='toggleAddBalance']";
    String cadastrar = "//button[contains(text(),'Cadastrar')]";

    String fecharModal = "//*[@id='btnCloseModal']";

    String emailLogin = "//*[@id='__next']/div/div[2]/div/div[1]/form/div[1]/input";

    String senhaLogin = "//*[@id='__next']/div/div[2]/div/div[1]/form/div[2]/div/input";

    String acessar = "//*[contains(text(),'Acessar')]";

    String mensagemBoasVindas = "//p[contains(text(),'bem vindo ao BugBank :)')]";

    public HomePage(WebDriver driverDoTeste) {
        this.driver = driverDoTeste;
    }

    public void clicarRegistrar() {
        driver.findElement(By.xpath(btnRegistrar)).click();
    }

    public void preencherEmail(String email_massa) {
        driver.findElement(By.xpath(email)).sendKeys(email_massa);
    }

    public void preencherNome(String nome_massa) {
        driver.findElement(By.xpath(nome)).sendKeys(nome_massa);

    }

    public void preencherSenha(String senha_massa) {
        driver.findElement(By.xpath(senha)).sendKeys(senha_massa);

    }

    public void preencherConfirmacaoSenha(String confirmacao_massa) {
        driver.findElement(By.xpath(confirmarSenha)).sendKeys(confirmacao_massa);
    }

    public void clicarCriarComSaldo() {
        driver.findElement(By.xpath(criarComSaldo)).click();
    }

    public void clicarCadastrar() {
        driver.findElement(By.xpath(cadastrar)).click();
    }

    public void clicarFecharContaCriada() {
        driver.findElement(By.xpath(fecharModal)).click();
    }

    public void preencheEmailLogin() {
        driver.findElement(By.xpath(emailLogin)).sendKeys("teste@teste.com.br");
    }

    public void preencheSenhaLogin() {
        driver.findElement(By.xpath(senhaLogin)).sendKeys("123456");
    }

    public void clicarAcessar() {
        driver.findElement(By.xpath(acessar)).click();
    }

    public boolean validaMsgBoasVindas() {
        return driver.findElement(By.xpath(mensagemBoasVindas)).isDisplayed();
    }

}
