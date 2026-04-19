<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Session Check</title>
</head>
<body>

<%
    String user = (String) session.getAttribute("user");

    if (user == null) {
%>
        <h2 style="color:red;">Session Expired!</h2>
        <p>Please enter your name again.</p>
        <a href="index.jsp">Go Back</a>
<%
    } else {
%>
        <h1>Hello <%= user %>!</h1>
        <p>Session is still active.</p>
<%
    }
%>

</body>
</html>
