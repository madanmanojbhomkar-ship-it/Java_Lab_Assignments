<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    String name = request.getParameter("username");

    if (name != null) {
        session.setAttribute("user", name);
    }

    // Set session expiry to 60 seconds (1 minute)
    session.setMaxInactiveInterval(60);

    String user = (String) session.getAttribute("user");
%>

<h1>Hello <%= user %>!</h1>
<p>Session will expire in 1 minute.</p>

<a href="check.jsp">Check Session After Some Time</a>

</body>
</html>
