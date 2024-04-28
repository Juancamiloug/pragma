Feature: Registrarse en el portal
    Como usuario deseo automatizar las funcionalidad de registro en la página: https://www.demoblaze.com/

  Background: Ingreso al portal
    Given que ingreso a la página https://www.demoblaze.com/

  @CP02
  @CP03
  @Registrase_en_el_portal
  Scenario: Registrase en el portal demoblaze.com
    And ingreso a la sección de registro
    When ingreso las credenciales de registro: Usuario y Contraseña
    Then valido el registro exitoso en el portal

  
