Feature: Test de registro y login de usuario en el portal
    Como usuario deseo automatizar las funcionalidades de registro y login en la página: https://www.demoblaze.com/

  Background: Ingreso al portal
    Given que ingreso a la página https://www.demoblaze.com/

  @Registrase_en_el_portal
  Scenario: Registrase en el portal demoblaze.com
    And ingreso a la sección de registro
    When ingreso las credenciales de registro: Usuario y Contraseña
    Then valido el registro exitoso en el portal

  @Iniciar_Sesión_en_el_portal
  Scenario: Iniciar sesión en el portal demoblaze.com
    And ingreso a la sección de Login
    When ingreso las credenciales de sesión: Usuario y Contraseña
    Then valido el ingreso exitoso en el portal
