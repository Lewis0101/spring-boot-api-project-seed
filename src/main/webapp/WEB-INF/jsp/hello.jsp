<html>
<head><title>Hello World</title></head>
<body>
Hello World!<br/>
<%
    out.println("Your IP address is " + request.getRemoteAddr());
%>
<form>
    First name: <input type="text" name="firstname"><br>
    Last name: <input type="text" name="lastname">
</form>
</body>
</html>