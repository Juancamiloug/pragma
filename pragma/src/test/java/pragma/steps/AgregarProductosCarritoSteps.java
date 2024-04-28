package pragma.steps;

import net.serenitybdd.annotations.Step;
import pragma.pages.CartPage;
import pragma.pages.HomePage;
import pragma.pages.ProductPage;
import pragma.utils.Utils;

public class AgregarProductosCarritoSteps extends Utils{
    
    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage;

    @Step
    public void ingresoACategoria (String categoria){
        homePage.ingresoACategoriaEspecifica(categoria);
    }

    @Step
    public void ingresoAlProducto(String producto){
        homePage.ingresoAProductoEspecifico(producto);
        productPage.validarAccesoAProducto(producto);
    }

    @Step
    public void extraigoElNombreYPrecioDelProducto(){
        productPage.extraerPrecioDeProducto();
        productPage.extraerNombreDeProducto();
        productPage.extraerNombreYprecioDeProducto();
    }

    @Step
    public void agregoElProductoAlCarritoDeCompra(){
        productPage.agregarProductoAlCarritoDeCompra();
    }

    @Step
    public void ingresoAlCarritoDeCompras() {
        homePage.ingresarAlCarritoDeCompra();
    }

    @Step
    public void validarAdicionCorrectaDeProducto(){
        cartPage.validarNombreYPrecioDeProductoAgregado(productPage.nombreYPrecioProdTxt);
    }

    @Step
    public void validarPrecioCorrectoDeCarrito(){
        cartPage.validarPrecioCorrectoDelCarrito(productPage.precioProd);
    }

    @Step
    public void regresoAlHomePage() {
        homePage.regresoAlHomePage();
    }

    @Step
    public void validarAdicionCorrectaDeProductos(){
        cartPage.validarNombreYPrecioDeProductoAgregado(productPage.nombreYPrecioProdTxt);
    }
}
