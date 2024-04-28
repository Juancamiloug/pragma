package pragma.steps;
import net.serenitybdd.annotations.Step;
import pragma.pages.HomePage;
import pragma.utils.Utils;

public class RegistroYLoginSteps extends Utils{

    String rutaDataRegistro = "src\\test\\resources\\data\\datosRegistroUsuario.csv";
    String rutaDataLogin = "src\\test\\resources\\data\\datosLoginUsuario.csv";
    HomePage homePage;


    @Step
    public void ingresarAlPortal(){
        homePage.ingresarAlPortal();
    }

    @Step
    public void ingresarSeccionRegistro(){
        homePage.ingresoARegistro();
    }

    @Step
    public void ingresarSeccionLogin(){
        homePage.ingresoALogin();
    }

    @Step
    public void registro(){
        homePage.ingresoInformacionDeRegistro(rutaDataRegistro);
    }

    @Step
    public void inciarSesionConCredenciales(){
        homePage.iniciarSesionEnELPortal(rutaDataLogin);
    }

    @Step
    public void validarLoginExitoso(){
        homePage.validarLoginExitoso();
    }

    @Step
    public void validarRegistroExitoso(){
        homePage.validarRegistroExitosoEnElPortal();
    }
    
}
