package pragma.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import pragma.steps.EliminarProductosCarritoSteps;

public class EliminarProductosCarritoDefinitions {

    @Steps
    EliminarProductosCarritoSteps eliminarProductoCarritoSteps;

    @Then("elimino el producto del carrito")
    public void eliminoElProductoDelCarrito() {
        eliminarProductoCarritoSteps.eliminoElProductoDelCarrito();
    }

    @And("valido que el carrito de compra este vacío")
    public void validoQueElCarritoDeCompraEsteVacio() {
        eliminarProductoCarritoSteps.validoQueElCarritoDeCompraEsteVacio();
    }
}
