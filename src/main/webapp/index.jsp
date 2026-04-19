/*9.c Build a Session Management using JSP program for getting  session expiry time and your name through text box and press submit to display the message by greeting Hello your name!. 
press the following link to check it within  the set session time  or wait there for the minutes set  to see the session expiry. */



<html>
<head>
    <title>Session Management</title>
</head>
<body>
    <h2>Session Management Example</h2>

    <form action="welcome.jsp" method="post">
        Enter Name: <input type="text" name="username" required /><br><br>

        Session Expiry Time (in minutes):
        <input type="number" name="time" min="1" required /><br><br>

        <input type="submit" value="Submit" />
    </form>

</body>
</html>