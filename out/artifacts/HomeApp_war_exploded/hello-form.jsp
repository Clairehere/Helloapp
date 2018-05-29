<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 29/05/18
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Questionnaire</title>
</head>
<body>

<form action="/custom-hello" method="post">
    Prénom :<br>
    <input type="text" name="firstname" >
    <br>
    Nom : <br>
    <input type="text" name="lastname" >
    <br>

    Heure : <br>
    <input type="datetime-local" name="date" >
    <br>

    <input type="submit" value="Envoyer">


</form>

<br>

</body>
</html>
