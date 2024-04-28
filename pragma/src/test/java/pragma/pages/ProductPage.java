package pragma.pages;

import org.openqa.selenium.By;

import pragma.utils.Utils;

public class ProductPage extends Utils{

    public By nombreProducto = By.xpath("//h2[@class='name']");
    public By precioProducto = By.xpath("//h3[@class='price-container']");
    public By buttonAddToCart = By.xpath("//a[@class='btn btn-success btn-lg']");

    public String nombreProd = "";
    public String precioProdTxt = "";
    public String nombreYPrecioProdTxt = "";
    public int precioProd;

    public void validarAccesoAProducto(String producto){
        compararTextoDeElemento(nombreProducto, producto);
    }
    
    public void extraerPrecioDeProducto(){
        precioProdTxt = extraerTextoElemento(precioProducto);
        precioProdTxt = precioProdTxt.replace("$","").replace(" *includes tax", "");
        precioProd += Integer.parseInt(precioProdTxt);
    }

    public void extraerNombreDeProducto(){
        nombreProd = extraerTextoElemento(nombreProducto);
     }

     public void extraerNombreYprecioDeProducto(){
            precioProdTxt = extraerTextoElemento(precioProducto);
            precioProdTxt = precioProdTxt.replace("$","").replace(" *includes tax", "");
            nombreYPrecioProdTxt += extraerTextoElemento(nombreProducto)+" ";
            nombreYPrecioProdTxt += Integer.parseInt(precioProdTxt)+"\n";
     }


    public void agregarProductoAlCarritoDeCompra(){
        clickAElemento(buttonAddToCart);
        aceptarAlertaVisible();
    }

}
