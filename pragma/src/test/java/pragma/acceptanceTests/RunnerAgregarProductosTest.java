package pragma.acceptanceTests;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features/AgregarProductosCarrito.feature"}
, glue="pragma", snippets = SnippetType.CAMELCASE
//, tags = ("@Agregar_un_producto_al_carrito_de_compra")
//, tags = ("@Agregar_dos_productos_al_carrito_de_compra_y_validar_total")
)
public class RunnerAgregarProductosTest {
    
}
