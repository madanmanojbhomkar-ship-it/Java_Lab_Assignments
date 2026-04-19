<%
    String user = (String) session.getAttribute("user");
%>

<html>
<head>
    <title>Session Check</title>
</head>
<body>
<%
    if (user != null) {
%>
        <h2>Hello <%= user %>! Your session is still active.</h2>
<%
    } else {
%>
        <h2>Session expired! Please enter your name again.</h2>
        <a href="index.jsp">Go Back</a>
<%
    }
%>
</body>
</html>