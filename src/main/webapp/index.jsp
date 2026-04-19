<!DOCTYPE html>
<html>
<head>
    <title>User Form</title>
    <script>
        function validateForm() {
            let username = document.forms["userForm"]["username"].value.trim();
            let email = document.forms["userForm"]["email"].value.trim();
            let designation = document.forms["userForm"]["designation"].value.trim();

            if (username === "" || email === "" || designation === "") {
                alert("All fields are required!");
                return false;
            }

            let emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,}$/;
            if (!email.match(emailPattern)) {
                alert("Invalid email format!");
                return false;
            }

            return true;
        }
    </script>
</head>
<body>

<h2>User Registration Form</h2>

<form name="userForm" action="UserDataServlet" method="post" onsubmit="return validateForm()">

    Username: <input type="text" name="username"><br><br>
    Email: <input type="text" name="email"><br><br>
    Designation: <input type="text" name="designation"><br><br>

    <input type="submit" value="Submit">

</form>

</body>
</html>