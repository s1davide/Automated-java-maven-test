#Author: Sebastian David Estrada Ojeda
#30 octubre 
@Lista
Feature: Leave
Scenario Outline: listas de todos los leave
Given abrir el navegador
And ingresar el usuario <user> y la contraseña <pass>
When Ingresar a la opcion leave list

Examples:
| user  | pass     |
| Admin | admin123 |
