Feature: Agregar productos al carrito de compra en el portal
    Como usuario deseo automatizar las funcionalidades para agregar productos al carrito de compra

  Background: Ingreso al portal
    Given que ingreso a la página https://www.demoblaze.com/

  @CP04
  @Agregar_un_producto_al_carrito_de_compra
  Scenario: Agregar un producto al carrito de compra
    And ingreso a la categoría "Phones"
    And ingreso al producto "Samsung galaxy s6"
    And extraigo el nombre y el precio del producto
    And agrego el producto al carrito de compra
    When ingreso al carrito de compras
    Then valido que se haya agregado el producto exitosamente
    Then valido el precio total del carrito

  @CP05
  @Agregar_dos_productos_al_carrito_de_compra
  Scenario: Agregar dos productos al carrito de compra y validar el total
    And ingreso a la categoría "Laptops"
    And ingreso al producto "Sony vaio i7"
    And extraigo el nombre y el precio del producto
    And agrego el producto al carrito de compra
    And regreso al home page
    And ingreso a la categoría "Monitors"
    And ingreso al producto "Apple monitor 24"
    And extraigo el nombre y el precio del producto
    And agrego el producto al carrito de compra
    When ingreso al carrito de compras
    Then valido que se hayan agregado los productos exitosamente
    Then valido el precio total del carrito

