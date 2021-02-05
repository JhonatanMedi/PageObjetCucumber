#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: Registro en la pagina Booking 
Scenario Outline: scenario description 
	Given abrir el navegador 
	When Ingresar al formulario <Email> 
	And Diligenciar los campos de contraseña <NuevaContraseña>  confirmar <ConfirmarContraseña> 
	
	
	Examples: 
		| Email 					| NuevaContraseña|ConfirmarContraseña|
		|jooyyjkjka@asesoftware.com |Pruebas2020	 |Pruebas2020|
		
		
