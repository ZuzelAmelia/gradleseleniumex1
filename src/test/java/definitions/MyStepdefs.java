package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementations.StepImplementation;

import java.io.IOException;

public class MyStepdefs {

    StepImplementation impl=new StepImplementation();
    @Given("^La pagina de login de la aplicacion se encuentra accesible$")
    public void laPaginaDeLoginDeLaAplicacionSeEncuentraAccesible() throws IOException {

        impl.testCodeHTTPResponse();
        impl.loadAltenWebSite();
        impl.verifyLoginField();
    }

    @When("^Se introduce un usuario y password para un usuario administrador$")
    public void seIntroduceUnUsuarioYPasswordParaUnUsuarioAdministrador() {

        impl.setUserAndPassword();
    }

    @Then("^Se muestra la pagina my Profile y el boton edit Profile esta habilitado\\.$")
    public void seMuestraLaPaginaMyProfileYElBotonEditProfileEstaHabilitado() {
        impl.verifyMyProfilePage();
        impl.verifyButtonEditProfile();


    }
}
