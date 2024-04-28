Feature: Iniciar sesión en el portal
    Como usuario deseo automatizar la funcionalidad de login en la página: https://www.demoblaze.com/

  Background: Ingreso al portal
    Given que ingreso a la página https://www.demoblaze.com/

  @CP01
  @Iniciar_sesion_en_el_portal
  Scenario: Iniciar sesión en el portal demoblaze.com
    And ingreso a la sección de Login
    When ingreso las credenciales de sesión: Usuario y Contraseña
    Then valido el ingreso exitoso en el portal

  
