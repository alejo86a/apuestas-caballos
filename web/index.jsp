<%--
  Created by IntelliJ IDEA.
  User: Alejo
  Date: 6/04/2020
  Time: 12:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>racecourse</title>
    <link type="text/css" href="style.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="js/script.js"></script>
  </head>
  <body>
  <form action="HypodromServlet" method="POST">
  <div class="left-panel">
    <table border="solid">
      <tr>
        <th># de caballo</th>
        <th>Nombre del caballo</th>
      </tr>
      <tr>
        <th>1</th>
        <th>Tales1</th>
      </tr>
      <tr>
        <th>2</th>
        <th>Tales2</th>
      </tr>
      <tr>
        <th>3</th>
        <th>Tales3</th>
      </tr>
      <tr>
        <th>4</th>
        <th>Tales4</th>
      </tr>
      <form action="" method="GET">
        <p> Jugador 1 <input type="number" name="Apuesta" placeholder="$ Valor de tu apuesta" min="0"></p>
        <p> Jugador 2 <input type="number" name="Apuesta" placeholder="$ Valor de tu apuesta" min="0"></p>
        <p> Jugador 3 <input type="number" name="Apuesta" placeholder="$ Valor de tu apuesta" min="0"></p>
        <p> Jugador 4 <input type="number" name="Apuesta" placeholder="$ Valor de tu apuesta" min="0"></p>
      </form>
    </table>
  </div>
  <div class="right-panel">
    <img src="assets/Hipodromojpg.jpg" height="300" width="500"/>

    <div id="tabla"></div>

  </div>
  </form>
  </body>
</html>
