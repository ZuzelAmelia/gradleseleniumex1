# gradleseleniumex1
My first project using Selenium, Gherkin, Cucumber and Serenity BDD

Ejercicio 1:
•       Basándonos en el framework Selenium automatizar el siguiente caso de prueba
o   Acceder mediante chrome a una url 
o   Logarse con usuario y password
o   Ejecutar el caso de prueba
o   Condicionantes:
  Los datos URL, usuario y password deben ser leidos de un fichero *.properties
  Cualquier ruta utilizada en el proyecto debe ser relativa.
 
Ejercicio 2:
•       Crear un proyecto Gradle e introducir las referencias a las librerías necesarias en el proyecto:
o   Selenium
o   Cucumber
o   Serenity BDD
•       Introducir en este proyecto, el código generado en el ejercicio 1 y comprobar que sigue funcionando
•       Ejecutar el caso de prueba como tarea gradle
 
Ejercicio 3:
•       Crear la siguiente feature en lenguaje Gherkin en el proyecto
Feature: Login de usuario
              Scenario: Login correcto con usuario administrador
                            Given La página de login de la aplicación se encuentra accesibe
                            When Se introduce un usuario y pasword para un usuario administrador
                            Then Se muestra la página “my Profile” y el botón “edit Profile” está habilitado.
 
Ejercicio 4:
•       “Linkar” los pasos del escenario gherkin con pasos automatizados a través del framework de cucumber
•       Introducir las siguientes verificaciones haciendo uso de “asserts” de Serenity BDD
o   Verificar que existe el campo “login” en la página principal
o   Verificar que después de clickar login se muestra la página “My Profile”.
o   Verificar que se muestra el botón edit Profile.
 
Documentación útil:
 
•       Consideraciones previas:
o   Nosotros siempre utilizamos IntelIJ. Tenlo en cuenta para hacer los ejercicios. Nosotros siempre utilizaremos ese IDE
o   En muchos apartados de la documentación hace referencia a MAVEN, nosotros siempre utilizaremos  GRADLE.

