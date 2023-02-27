<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here</title>
</head>
<body>
<h2>Login Here..!</h2>
<form action="verifyLogin" method="post">
<pre>
EmailId<input type="text" name="emailId"/>
Password<input type="password" name="password"/>
<input type="submit" value="login"/>
</pre>
</form>
${msg }
${error }
</body>
</html>