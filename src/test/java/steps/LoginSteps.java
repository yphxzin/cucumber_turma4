package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.net.http.WebSocket;
import java.util.concurrent.TimeUnit;

public class LoginSteps {

    static WebDriver driver;
    HomePage homePage;


    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage = new HomePage(driver);

    }

    @AfterAll
    public static void after(){
        driver.quit();
    }
    @Dado("que esteja na pagina inicial: {string}")
    public void queEstejaNaPaginaInicial(String url) {
        driver.get(url);
    }

    @E("possua um cadastro")
    public void possuaUmCadastro() {
        homePage.clicarRegistrar();
        homePage.preencherEmail();
        homePage.preencherNome();
        homePage.preencherSenha();
        homePage.preencherConfirmacaoSenha();
        homePage.clicarCriarComSaldo();
        homePage.clicarCadastrar();
        homePage.clicarFecharContaCriada();
    }

    @Quando("prencher email: {string} e senha: {string}")
    public void prencherEmailESenha(String email, String senha) {
        homePage.preencheEmailLogin();
        homePage.preencheSenhaLogin();
    }

    @E("clica em fazer login")
    public void clicaEmFazerLogin() {
        homePage.clicarAcessar();
    }

    @Entao("validar se a pagina de boas vindas foi carregada com sucesso")
    public void validarSeAPaginaDeBoasVindasFoiCarregadaComSucesso() {
        Assert.assertTrue(homePage.validaMsgBoasVindas());
    }
}
