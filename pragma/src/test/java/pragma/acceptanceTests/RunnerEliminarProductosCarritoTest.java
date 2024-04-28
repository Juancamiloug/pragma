package pragma.acceptanceTests;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features/EliminarProductosCarrito.feature"}
, glue="pragma", snippets = SnippetType.CAMELCASE
//, tags = ("@Eliminar_un_producto_del_carrito_de_compra")
//, tags = ("@Eliminar_tres_productos_del_carrito_de_compra")
)
public class RunnerEliminarProductosCarritoTest {
    
}
