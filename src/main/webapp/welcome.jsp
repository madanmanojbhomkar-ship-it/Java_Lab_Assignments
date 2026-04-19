<%
    String name = request.getParameter("username");
    int time = Integer.parseInt(request.getParameter("time"));

    // Create session
    session.setAttribute("user", name);

    // Convert minutes to seconds
    session.setMaxInactiveInterval(time * 60);
%>

<html>
<head>
    <title>Welcome</title>
</head>
<body>

    <h2>Hello <%= name %>!</h2>

    <p>
        Your session expiry time is set to <b><%= time %> minute(s)</b>.
    </p>

    <p>
        Press the following link to check it within the set session time 
        or wait for the minutes set to see the session expiry.
    </p>

    <a href="checkSession.jsp">Check Session Status</a>

</body>
</html>