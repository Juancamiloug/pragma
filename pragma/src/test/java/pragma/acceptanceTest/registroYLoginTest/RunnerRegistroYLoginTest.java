package pragma.acceptanceTest.registroYLoginTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features/RegistroYLoginUsuario.feature"}
, glue="pragma", snippets = SnippetType.CAMELCASE
//, tags = ("@Registrase_en_el_portal")
//, tags = ("@Iniciar_Sesión_en_el_portal")
)
public class RunnerRegistroYLoginTest {
    
}
