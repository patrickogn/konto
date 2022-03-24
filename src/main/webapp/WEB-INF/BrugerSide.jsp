<%--
  Created by IntelliJ IDEA.
  User: patricknielsen
  Date: 24/03/2022
  Time: 10.48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Din side</title>
</head>
<body>
<h1>Polish Workers inc</h1>
<br>

<h2>Velkommen:  ${sessionScope.konto.navn}</h2>

<h2>Din saldo er: ${sessionScope.konto.saldo}</h2>


<!-- log ud knap-->
<%--<form action="LoginServlet">
    <label for="fname">Navn:</label><br>
    <input type="text" id="fname" name="navn" value="navn"><br>
    <label for="lname">Kodeord:</label><br>
    <input type="password" id="lname" name="kode" value="hemmelig"><br><br>
    <input type="submit" value="Log af">
    <br>--%>


<h1>Hæv penge</h1>
<br>

<form action="TransaktionServlet">
    <label for="fname">Angiv beløb</label><br>
    <input type="number" id="fname" name="beløb" value="0"><br>
    <input type="submit" value="Submit">
</form>


</body>
</html>
