Feature: Test eliminar producto al carrito de compra en el portal
    Como usuario deseo automatizar la funcionalidad de eliminar un producto del carrito de compra

  Background: Ingreso al portal
    Given que ingreso a la página https://www.demoblaze.com/

  @Eliminar_un_producto_del_carrito_de_compra
  Scenario: Eliminar un producto del carrito de compra
    And ingreso a la categoría "Laptops"
    And ingreso al producto "MacBook Pro"
    And agrego el producto al carrito de compra
    When ingreso al carrito de compras
    Then elimino el producto del carrito
    And valido que el carrito de compra este vacío

  @Eliminar_tres_productos_del_carrito_de_compra
  Scenario: Eliminar un producto del carrito de compra
    And ingreso a la categoría "Phones"
    And ingreso al producto "Nexus 6"
    And agrego el producto al carrito de compra
    And regreso al home page
    And ingreso a la categoría "Laptops"
    And ingreso al producto "Dell i7 8gb"
    And agrego el producto al carrito de compra
    And regreso al home page
    And ingreso a la categoría "Monitors"
    And ingreso al producto "ASUS Full HD"
    And agrego el producto al carrito de compra
    When ingreso al carrito de compras
    Then elimino el producto del carrito
    And valido que el carrito de compra este vacío
