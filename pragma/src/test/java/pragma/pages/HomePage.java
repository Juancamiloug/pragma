package pragma.pages;

import static org.junit.jupiter.api.Assertions.fail;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.opencsv.CSVReader;
import net.serenitybdd.core.Serenity;
import pragma.utils.Utils;

public class HomePage extends Utils {

    // Localizadores Home Page
    public By buttonLoginHome = By.id("login2");
    public By buttonSignUpHome = By.id("signin2");
    public By buttonCartHome = By.xpath("//a[@id='cartur']");
    public By buttonHome = By.xpath("//a[contains(text(),'Home')]");
    public By buttonCatPhones = By.xpath("//a[contains(text(),'Phones')]");
    public By buttonCatLaptops = By.xpath("//a[contains(text(),'Laptops')]");
    public By buttonCatMonitors = By.xpath("//a[contains(text(),'Monitors')]");

    // Localizadores modal registro
    public By inputUserNameSign = By.id("sign-username");
    public By inputPasswordSign = By.id("sign-password");
    public By buttonCloseSign = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");
    public By buttonSignUp = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");

    // Localizadores modal login
    public By inputUserNameLogin = By.id("loginusername");
    public By inputPasswordLogin = By.id("loginpassword");
    public By buttonLogin = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

    // Localizador post login
    public By buttonWelcome = By.id("nameofuser");

    public void ingresarAlPortal() {
        abrirPaginaWeb();
    }

    public void ingresoARegistro() {
        clickAElemento(buttonSignUpHome);
    }

    public void ingresoALogin() {
        clickAElemento(buttonLoginHome);
    }

    public void ingresoInformacionDeRegistro(String rutaDataRegistro) {
        CSVReader csvReader = dataCsv(rutaDataRegistro);
        String[] list = null;
        Integer contador = 0;
        try {
            while ((list = csvReader.readNext()) != null) {
                if (contador >= 1) {
                    try {
                        escribirEnElementoYEnter(inputUserNameSign, list[0]);
                        escribirEnElementoYEnter(inputPasswordSign, list[1]);
                        clickAElemento(buttonSignUp);
                    } catch (Exception e) {
                        System.out.println(
                                ">>>>> " + e);
                        contador++;
                    }
                } else {
                    contador++;
                }
            }
        } catch (Exception e) {
            System.out.println(">>>>> " + e);
            fail(e);
        }
    }

    public void iniciarSesionEnELPortal(String rutaDataLogin) {
        CSVReader csvReader = dataCsv(rutaDataLogin);
        String[] list = null;
        Integer contador = 0;
        try {
            while ((list = csvReader.readNext()) != null) {
                if (contador >= 1) {
                    try {
                        escribirEnElementoYEnter(inputUserNameLogin, list[0]);
                        escribirEnElementoYEnter(inputPasswordLogin, list[1]);
                        clickAElemento(buttonLogin);
                    } catch (Exception e) {
                        System.out.println(
                                ">>>>> " + e);
                        contador++;
                    }
                } else {
                    contador++;
                }
            }
        } catch (Exception e) {
            System.out.println(">>>>> " + e);
            fail(e);
        }
    }

    public void validarRegistroExitosoEnElPortal() {
        String respuesta = moverAAlertaYExtraerTexto();
        respuesta = respuesta.toLowerCase();
        if (respuesta.contains("succesful") || respuesta.contains("exitoso")) {
            respuesta = ">>>> Cliente registrado con exito !!";
        } else if (respuesta.contains("already") || respuesta.contains("existe")) {
            respuesta = ">>>> Cliente registrado previamente !!";
            Serenity.takeScreenshot();
            fail("Cliente registrado previamente !!");
        } else {
            respuesta = ">>>> Error en el proceso de registro !!";
            Serenity.takeScreenshot();
            fail("Error en el proceso de registro !!");
        }
        System.out.println(respuesta);
        Serenity.takeScreenshot();
    }

    public void validarLoginExitoso() {

        try {
            waitFor(ExpectedConditions.alertIsPresent());
            String mensaje = moverAAlertaYExtraerTexto();
            mensaje = mensaje.toLowerCase();
            if (mensaje.contains("wrong password")) {
                mensaje = ">>>> Contraseña errada !!";
                System.out.println(mensaje);
                Serenity.takeScreenshot();
                fail("Contraseña errada");
            } else if (mensaje.contains("User does not exist")) {
                mensaje = ">>>> Usuario no registrado !!";
                System.out.println(mensaje);
                Serenity.takeScreenshot();
                fail("Usuario no registrado");
            }
        } catch (Exception e) {
            String respuesta;
            if (element(buttonWelcome).isPresent()) {
                respuesta = ">>>> Login de usuario exitoso !!";
                System.out.println(respuesta);
                Serenity.takeScreenshot();
            }
        }
    }

    public void ingresoACategoriaEspecifica(String categoria) {
        switch (categoria) {
            case "Phones":
                clickAElemento(buttonCatPhones);
                break;
            case "Laptops":
                clickAElemento(buttonCatLaptops);
                break;
            case "Monitors":
                clickAElemento(buttonCatMonitors);
                break;
            default:
                fail("Categoría no valida");
        }
    }

    public void ingresoAProductoEspecifico(String producto){
        clickAElemento(By.xpath("//a[contains(text(),'"+producto+"')]"));
    }

    public void ingresarAlCarritoDeCompra(){
        clickAElemento(buttonCartHome);
    }

    public void regresoAlHomePage(){
        clickAElemento(buttonHome);
    }
}
