package pragma.utils;

import java.io.Reader;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileReader;
import com.opencsv.CSVReaderBuilder;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Utils extends PageObject {

    String texto;

    /* Abrir página web por defecto */
    public void abrirPaginaWeb() {
        open();
    }

    /* Extraer datos de CSV */
    public CSVReader dataCsv(String ruta) {
        CSVReader celdas = null;
        try {
            Reader archCSV = new FileReader(ruta);
            CSVParser Comma = new CSVParserBuilder().withSeparator(',').build();
            celdas = new CSVReaderBuilder(archCSV).withCSVParser(Comma).build();
        } catch (Exception e) {
            System.out.println("Error en la lectura del archivo CSV : " + e);
        }
        return celdas;
    }

    /* Escribir en elemento y Enter */
    public void escribirEnElementoYEnter(By elemento, String texto) {
        WebElementFacade localizadorw = find(elemento);
        localizadorw.typeAndEnter(texto);
    }

    /* Click a elemento */
    public void clickAElemento(By elemento) {
        find(elemento).click();
    }

    /* Mover a alerta y extraer texto */
    public String moverAAlertaYExtraerTexto() {
        waitFor(ExpectedConditions.alertIsPresent());
        return texto = getDriver().switchTo().alert().getText();
    }

    /* Esperar por elemento clickeable */
    public void esperarPorElementoVisible(By elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), getWaitForTimeout());
        wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
    }

    /* Mover a elemento activo */
    public void moverAElemento(By elemento) {
        // WebElement element = find(elemento);
        moveTo(elemento);
    }

    /* Click a elemento */
    public void forzarClickJS(By element) {
        WebElement Webelement = getDriver().findElement(element);
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click()", Webelement);
    }

    /* Extraer texto de elemento */
    public String extraerTextoElemento(By elemento) {
        texto = find(elemento).getText();
        return texto;
    }

    /* Comparar texto de elemento */
    public void compararTextoDeElemento(By elemento, String textoRequerido){
        texto = extraerTextoElemento(elemento);
        assertEquals(texto, textoRequerido);
    }

    /* Esperar tiempo */

    public void esperarMilisegundos(Integer milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* Aceptar alerta visible */
    public boolean aceptarAlertaVisible() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), getWaitForTimeout());
            wait.until(ExpectedConditions.alertIsPresent());
            getDriver().switchTo().alert().accept();
            return true;
        } catch (Exception e) {
            System.out.println("alerta no presente");
            return false;
        }
    }

}
