Feature: Login de usuario

Scenario: Login correcto con usuario administrador
  Given La pagina de login de la aplicacion se encuentra accesible
  When Se introduce un usuario y password para un usuario administrador
  Then Se muestra la pagina my Profile y el boton edit Profile esta habilitado.
