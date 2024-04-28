package pragma.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pragma.steps.AgregarProductosCarritoSteps;

public class AgregarProductosCarritoDefinitions {

    @Steps
    AgregarProductosCarritoSteps agregarProductosCarritoSteps;

    @And("ingreso a la categoría {string}")
    public void ingresoALaCategoría(String categoria) {
        agregarProductosCarritoSteps.ingresoACategoria(categoria);
    }

    @And("ingreso al producto {string}")
    public void ingresoAlProducto(String string) {
        agregarProductosCarritoSteps.ingresoAlProducto(string);
    }

    @And("extraigo el nombre y el precio del producto")
    public void extraigoElNombreYPrecioDelProducto() {
        agregarProductosCarritoSteps.extraigoElNombreYPrecioDelProducto();
    }

    @And("agrego el producto al carrito de compra")
    public void agregoElProductoAlCarritoDeCompra() {
        agregarProductosCarritoSteps.agregoElProductoAlCarritoDeCompra();
    }

    @When("ingreso al carrito de compras")
    public void ingresoAlCarritoDeCompras() {
        agregarProductosCarritoSteps.ingresoAlCarritoDeCompras();
    }

    @Then("valido que se haya agregado el producto exitosamente")
    public void validoQueSeHayaAgregadoElProductoExitosamente() {
        agregarProductosCarritoSteps.validarAdicionCorrectaDeProducto();
    }

    @Then("valido el precio total del carrito")
    public void validoElPrecioTotalDelCarrito() {
        agregarProductosCarritoSteps.validarPrecioCorrectoDeCarrito();
    }

    @And("regreso al home page")
    public void regresoAlHomePage() {
        agregarProductosCarritoSteps.regresoAlHomePage();
    }


    @Then("valido que se hayan agregado los productos exitosamente")
    public void validoQueSeHayanAgregadoLosProductosExitosamente() {
        agregarProductosCarritoSteps.validarAdicionCorrectaDeProductos();
    }

}
