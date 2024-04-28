package pragma.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pragma.steps.RegistroYLoginSteps;

public class RegistroYLoguinDefinitions {

    @Steps
    RegistroYLoginSteps registroYLoginSteps;

    @Given("que ingreso a la página https:\\/\\/www.demoblaze.com\\/")
    public void queIngresoALaPáginaHttpsWwwDemoblazeCom() {
        registroYLoginSteps.ingresarAlPortal();
    }

    @And("ingreso a la sección de registro")
    public void ingresoALaSecciónDeRegistro() {
        registroYLoginSteps.ingresarSeccionRegistro();
    }

    @When("ingreso las credenciales de registro: Usuario y Contraseña")
    public void ingresoLasCredencialesDeRegistro() {
        registroYLoginSteps.registro();
    }

    @Then("valido el registro exitoso en el portal")
    public void validoElRegistroExitosoEnElPortal() {
        registroYLoginSteps.validarRegistroExitoso();
    }

    @And("ingreso a la sección de Login")
    public void ingresoALaSeccionDeLogin() {
        registroYLoginSteps.ingresarSeccionLogin();
    }

    @When("ingreso las credenciales de sesión: Usuario y Contraseña")
    public void ingresoLasCredencialesDeSesionUsuarioYContraseña() {
        registroYLoginSteps.inciarSesionConCredenciales();

    }

    @Then("valido el ingreso exitoso en el portal")
    public void validoElIngresoExitosoEnElPortal() {
        registroYLoginSteps.validarLoginExitoso();
    }

}
