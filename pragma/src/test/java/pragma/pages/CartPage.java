package pragma.pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import pragma.utils.Utils;

public class CartPage extends Utils{

    public By precioCarrito = By.xpath("//h3[@id='totalp']");
    public By grillaProductos = By.xpath("//body/div[@id='page-wrapper']/div[@class='row']/div[@class='col-lg-8']/div[@class='table-responsive']/table[@class='table table-bordered table-hover table-striped']/tbody[@id='tbodyid']");
    public String respuesta;
    public String precioTotalCarrito;

    public void validarNombreYPrecioDeProductoAgregado(String nombreYPrecioProducto){
        respuesta = extraerTextoElemento(grillaProductos).replace(" Delete", "");
        System.out.println(respuesta);
        if (respuesta.contains(nombreYPrecioProducto.trim())){
            System.out.println("Producto agregado exitosamente");
        }else{
            System.out.println("Producto no agregado");
        }
    }
    
    public void validarPrecioCorrectoDelCarrito(int precioProducto){
        String precioProductoString = Integer.toString(precioProducto);
        precioTotalCarrito = extraerTextoElemento(precioCarrito);
        assertEquals(precioProductoString, precioTotalCarrito);
    }
}
