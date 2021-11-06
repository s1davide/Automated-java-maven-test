#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: Registro en la pagina Booking 
Scenario Outline: Ingreso exitoso 
	Given abrir el navegador 
	And ingresar el usuario <user> y la contraseña <pass>
Examples:
	| user     | pass     |
	| Admin    | admin123	|
	
