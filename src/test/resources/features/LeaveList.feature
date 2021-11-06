#Author: Sebastian David Estrada Ojeda
#30 octubre
@Sprint1
Feature: Leave

  @Lista
  Scenario Outline: listas de todos los leave
    Given abrir el navegador
    And ingresar el usuario <user> y la contraseña <pass>
    When Ingresar a la opcion leave list

    Examples: 
      | user  | pass     |
      | Admin | admin123 |

  @employee
  Scenario Outline: employee
    Given abrir el navegador
    And ingresar el usuario <user> y la contraseña <pass>
    When Ingresar a la opcion leave list
    And se diligencia el campo <employee> selecciono <actions>

    Examples: 
      | user  | pass     | employee    | actions |
      | Admin | admin123 | Garry White | Cancel  |
