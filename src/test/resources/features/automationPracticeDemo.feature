#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Tienda Virtual Automation Practice
  El Usuario ingresa a automationpractice.com
  Realiza el proceso de registro de cuenta
  Y comprar prodcuto.

  @Creacion_cuenta_usuario_exitosa
    Scenario Outline: creacion de cuenta de usuario
      Given Carlos ingresa un email valido
        |<email>|
      When diligencio formulario de creacion de usuario con los datos
        |titulo|nombre|apellido|pasword|dia|mes|year|direccion|ciudad|estado|codigoPostal|pais|celular|
        |<titulo>|<nombre>|<apellido>|<pasword>|<dia>|<mes>|<year>|<direccion>|<ciudad>|<estado>|<codigoPostal>|<pais>|<celular>|
      Then verifico que el en el perfil de usuario se visualice el nombre
        |<nombre>|<apellido>|
    Examples:
    |titulo|nombre|apellido|pasword|dia|mes|year|direccion|ciudad|estado|codigoPostal|pais|celular|email|
    |Mr.   |Carlos|Atencia |123456|2 |6|1991|Cra. 48 #68 Sur-38|Sabaneta|California|05545|United States|3014784362|karlosatencia71@gmail.com|

    @ComprarProducto
    Scenario Outline: comprar producto en automationpractice.com
      Given Carlos inicia sesion con sus credenciales
        |<email>|<password>|
      When selecciona un producto y lo agrega al carrito de compra
        |<categoria>|<subcategoria>|<producto>|
      Then verifico que el producto se encuentren en carrito de compra
        |<producto>|
      Examples:
        |email|password|categoria|subcategoria|producto|
        |karlosatencia71@gmail.com|123456|Women|T-shirts|Faded Short Sleeve T-shirts|



