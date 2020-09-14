# language:es

@Autentication1
Característica: Autenticar
  Yo como usuario
  quiero autenticarme en la aplicación
  para comprobar mis credenciales

  @Autentication
  Escenario: Iniciar sesión en la aplicación Eribank version 1
    Cuando inicio sesión con nombre de usuario company y contraseña company
    Entonces deberías ver la página de inicio

  @Autentication
  Escenario: Iniciar sesión en la aplicación Eribank version 2
    Cuando inicio sesión con nombre de usuario company y contraseña company
    Entonces deberías ver la página de inicio

  @Autentication
  Escenario: Iniciar sesión en la aplicación Eribank version 3
    Cuando inicio sesión con nombre de usuario company y contraseña company
    Entonces deberías ver la página de inicio

  @Autentication
  Escenario: Iniciar sesión en la aplicación Eribank version 4
    Cuando inicio sesión con nombre de usuario company y contraseña company
    Entonces deberías ver la página de inicio