package pragma.steps;

import net.serenitybdd.annotations.Step;
import pragma.pages.CartPage;
import pragma.utils.Utils;

public class EliminarProductosCarritoSteps extends Utils{

    CartPage cartPage;

    @Step
    public void eliminoElProductoDelCarrito() {
        cartPage.eliminarProductoDelCarrito();
    }

    @Step
    public void validoQueElCarritoDeCompraEsteVacio() {
        cartPage.validarCarritoDeCompraVacio();
    }
}
