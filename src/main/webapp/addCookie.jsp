<%@ page session="true" %>
<%
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    int maxAge = Integer.parseInt(request.getParameter("maxage"));

    Cookie cookie = new Cookie(name, domain);

    cookie.setMaxAge(maxAge);

    response.addCookie(cookie);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Cookie Added</title>
</head>
<body>

<h2>Cookie Added Successfully!</h2>

<p><b>Cookie Name:</b> <%= name %></p>
<p><b>Cookie Domain Value:</b> <%= domain %></p>
<p><b>Max Age:</b> <%= maxAge %> seconds</p>

<br>

<a href="listCookies.jsp">Go to Active Cookie List</a>

</body>
</html>
