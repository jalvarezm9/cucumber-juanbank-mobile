# language:es

@Autentication
Característica: Autenticar
  Yo como usuario
  quiero autenticarme en la aplicación
  para comprobar mis credenciales

  @Auth1
  Escenario: CP01 Iniciar sesión en la aplicación Eribank version 1
    Cuando inicio sesión con nombre de usuario company y contraseña company
    Entonces deberías ver la página de inicio

  @Auth2
  Escenario: Iniciar sesión en la aplicación Eribank version 2
    Cuando inicio sesión con nombre de usuario company y contraseña company
    Entonces deberías ver la página de inicio

  @Auth3
  Escenario: Iniciar sesión en la aplicación Eribank version 3
    Cuando inicio sesión con nombre de usuario company y contraseña company
    Entonces deberías ver la página de inicio

  @Auth4
  Escenario: Iniciar sesión en la aplicación Eribank version 4
    Cuando inicio sesión con nombre de usuario company y contraseña company
    Entonces deberías ver la página de inicio