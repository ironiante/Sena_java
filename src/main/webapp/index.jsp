<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Inicio de Sesión</title>
  <!-- Enlazar el archivo CSS -->
  <link rel="stylesheet" href="styles.css">
</head>
<body>



<!-- Formulario -->
<form action="hello-servlet" method="POST">
  <h1>Inicio de Sesión</h1>
  <label for="username">Usuario:</label>
  <input type="text" id="username" name="username" placeholder="Ingresa tu usuario" required>
  <label for="password">Contraseña:</label>
  <input type="password" id="password" name="password" placeholder="Ingresa tu contraseña" required>
  <button type="submit">Iniciar Sesión</button>
</form>
</body>
</html>

